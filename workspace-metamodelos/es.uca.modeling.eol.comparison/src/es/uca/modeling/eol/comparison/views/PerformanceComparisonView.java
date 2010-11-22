package es.uca.modeling.eol.comparison.views;


import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.grouplayout.GroupLayout;
import org.eclipse.swt.layout.grouplayout.LayoutStyle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.experimental.chart.swt.ChartComposite;

import com.itextpdf.text.Document;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.DefaultFontMapper;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

import es.uca.modeling.eol.comparison.Activator;
import es.uca.modeling.eol.comparison.model.CaseStudyConfigurationModel;
import es.uca.modeling.eol.comparison.model.CaseStudyResult;
import es.uca.modeling.eol.comparison.model.ParameterProxy;

/**
 * Eclipse view for selecting a case study, configuring its parameters and
 * presenting the results.
 * 
 * @author Antonio García-Domínguez
 */
public class PerformanceComparisonView extends ViewPart {
	@SuppressWarnings("unused")
	private DataBindingContext m_bindingContext;

	private final class RunSelectionListener extends SelectionAdapter {

		@Override
		public void widgetSelected(SelectionEvent event) {
			final CaseStudyExecutionJob runJob
				= new CaseStudyExecutionJob("Run Comparison", fModel.getCaseStudy());
			runJob.setUser(true);
			runJob.setPriority(Job.LONG);
			runJob.addJobChangeListener(new JobChangeAdapter() {
				@Override
				public void done(final IJobChangeEvent event) {
					if (event.getResult().isOK()) {
						PerformanceComparisonView.this.chartComposite.getDisplay().syncExec(new Runnable(){
							public void run() {
								final CaseStudyExecutionJob job = (CaseStudyExecutionJob)event.getJob();
								updateResults(job.getCaseStudyResult());
							}
						});
					}
				}
			});
			runJob.schedule();
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent event) {
			widgetSelected(event);
		}
	}
	private final class SaveChartSelectionListener extends SelectionAdapter {
		private final Composite parent;

		private SaveChartSelectionListener(Composite parent) {
			this.parent = parent;
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}

		@Override
		public void widgetSelected(SelectionEvent e) {
			FileDialog dlg = new FileDialog(parent.getShell());
			dlg.setFilterNames(new String[]{"PDF"});
			dlg.setFilterExtensions(new String[]{"*.pdf"});
			dlg.setOverwrite(true);
			final String path = dlg.open();
			if (path != null) {
				saveChartToPDF(parent, path);
			}
		}
	}
	private final class SaveRawSelectionListener extends SelectionAdapter {
		private final Composite parent;

		private SaveRawSelectionListener(Composite parent) {
			this.parent = parent;
		}

		@Override
		public void widgetSelected(SelectionEvent e) {
			FileDialog dlg = new FileDialog(parent.getShell(), SWT.SAVE);
			String path = dlg.open();
			dlg.setFilterNames(new String[]{"*.txt","*.*"});
			dlg.setOverwrite(true);
			if (path != null) {
				saveRawToFile(parent, path);
			}
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	}
	private final class ParameterProxyValueLabelProvider extends ColumnLabelProvider {
		@Override
		public String getText(Object element) {
			return ((ParameterProxy)element).getParameterValue();
		}
	}
	private final class ParameterProxyNameLabelProvider extends ColumnLabelProvider {
		@Override
		public String getText(Object element) {
			return ((ParameterProxy)element).getParameterName();
		}
	}

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "es.uca.modeling.eol.comparison.views.PerformanceComparisonView";

	// The model bean
	private CaseStudyConfigurationModel fModel;

	// GUI controls and viewers 
	private Label lblParams;
	private Table tblParams;
	private TableViewer tblviewParams;

	private Label lblOutput;
	private Text txtRawOutput;

	private Label lblCase;
	private Combo cmbCaseStudy;
	private ComboViewer cmbViewer;

	private Button btnRun;
	private Button btnSaveRaw;
	private Button btnSaveChart;

	private ChartComposite chartComposite;

	/**
	 * The constructor.
	 */
	public PerformanceComparisonView() {
		fModel = new CaseStudyConfigurationModel(Activator.getDefault().getRegistry());
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		initCaseSelection(parent);
		initLaunchers(parent);
		initParameterTable(parent);
		initRawOutput(parent);
		initChart(parent);
		m_bindingContext = initDataBindings();
		initLayout(parent);
	}

	private void initLaunchers(final Composite parent) {
		btnRun = new Button(parent, SWT.NONE);
		btnRun.addSelectionListener(new RunSelectionListener());
		btnRun.setText("Run");

		btnSaveRaw = new Button(parent, SWT.NONE);
		btnSaveRaw.addSelectionListener(new SaveRawSelectionListener(parent));
		btnSaveRaw.setText("Save Raw...");

		btnSaveChart = new Button(parent, SWT.NONE);
		btnSaveChart.addSelectionListener(new SaveChartSelectionListener(parent));
		btnSaveChart.setText("Save Chart...");
	}

	private void initChart(Composite parent) {
		chartComposite = createEmptyChart(parent);
	}

	private ChartComposite createEmptyChart(Composite parent) {
		XYSeriesCollection coll = new XYSeriesCollection();
		JFreeChart chart = ChartFactory.createXYLineChart(
			"Execution times", "Size", "Time (secs)", coll,
			PlotOrientation.VERTICAL, true, true, false);
		return new ChartComposite(parent, 0, chart);
	}

	private void initRawOutput(Composite parent) {
		lblOutput = new Label(parent, SWT.NONE);
		lblOutput.setText("Raw output");
		txtRawOutput = new Text(parent,
				SWT.BORDER | SWT.READ_ONLY | SWT.WRAP |
				SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL |
				SWT.MULTI);
		txtRawOutput.setText("this is a test");
	}

	private void initParameterTable(Composite parent) {
		lblParams = new Label(parent, SWT.NONE);
		lblParams.setText("Parameters");

		tblviewParams = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
		tblParams = tblviewParams.getTable();
		tblParams.setHeaderVisible(true);
		tblParams.setLinesVisible(true);
		tblParams.setSelection(0);

		TableViewerColumn tblcolviewName = new TableViewerColumn(tblviewParams, SWT.LEFT);
		TableColumn tblcolName = tblcolviewName.getColumn();
		tblcolName.setWidth(118);
		tblcolName.setText("Name");
		tblcolviewName.setLabelProvider(new ParameterProxyNameLabelProvider());

		TableViewerColumn tblcolviewValue = new TableViewerColumn(tblviewParams, SWT.LEFT);
		TableColumn tblclmnValue = tblcolviewValue.getColumn();
		tblclmnValue.setWidth(100);
		tblclmnValue.setText("Value");
		tblcolviewValue.setLabelProvider(new ParameterProxyValueLabelProvider());
		tblcolviewValue.setEditingSupport(new ParamValueEditingSupport(tblviewParams));

		tblviewParams.setContentProvider(new ParameterContentProvider());
		tblviewParams.setInput(fModel);
	}

	private void initCaseSelection(Composite parent) {
		lblCase = new Label(parent, SWT.NONE);
		lblCase.setAlignment(SWT.RIGHT);
		lblCase.setText("Case study:");

		cmbViewer = new ComboViewer(parent, SWT.READ_ONLY);
		cmbCaseStudy = cmbViewer.getCombo();
		cmbViewer.setLabelProvider(new CaseStudyLabelProvider());
		cmbViewer.setContentProvider(new CaseStudyContentProvider());
		cmbViewer.setInput(fModel);
		cmbCaseStudy.select(0);
	}

	private void initLayout(Composite parent) {
		GroupLayout gl_parent = new GroupLayout(parent);
		gl_parent.setHorizontalGroup(
			gl_parent.createParallelGroup(GroupLayout.LEADING)
				.add(gl_parent.createSequentialGroup()
					.addContainerGap()
					.add(gl_parent.createParallelGroup(GroupLayout.LEADING, false)
						.add(tblParams, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
						.add(gl_parent.createSequentialGroup()
							.add(gl_parent.createParallelGroup(GroupLayout.TRAILING)
								.add(lblParams)
								.add(lblCase))
							.addPreferredGap(LayoutStyle.RELATED)
							.add(cmbCaseStudy, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)))
					.add(18)
					.add(gl_parent.createParallelGroup(GroupLayout.TRAILING)
						.add(gl_parent.createParallelGroup(GroupLayout.LEADING)
							.add(lblOutput)
							.add(gl_parent.createSequentialGroup()
								.add(btnRun)
								.addPreferredGap(LayoutStyle.RELATED)
								.add(btnSaveRaw)
								.addPreferredGap(LayoutStyle.RELATED)
								.add(btnSaveChart)))
						.add(txtRawOutput, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.UNRELATED)
					.add(chartComposite, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_parent.setVerticalGroup(
			gl_parent.createParallelGroup(GroupLayout.LEADING)
				.add(GroupLayout.TRAILING, gl_parent.createSequentialGroup()
					.addContainerGap()
					.add(gl_parent.createParallelGroup(GroupLayout.TRAILING)
						.add(GroupLayout.LEADING, chartComposite, GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
						.add(gl_parent.createSequentialGroup()
							.add(gl_parent.createParallelGroup(GroupLayout.BASELINE)
								.add(cmbCaseStudy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.add(btnRun)
								.add(btnSaveRaw)
								.add(btnSaveChart)
								.add(lblCase))
							.addPreferredGap(LayoutStyle.RELATED)
							.add(gl_parent.createParallelGroup(GroupLayout.BASELINE)
								.add(lblParams)
								.add(lblOutput))
							.addPreferredGap(LayoutStyle.RELATED)
							.add(gl_parent.createParallelGroup(GroupLayout.TRAILING)
								.add(txtRawOutput, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
								.add(tblParams, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))))
					.addContainerGap())
		);

		parent.setLayout(gl_parent);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
		tblParams.setFocus();
	}

	private DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue cmbViewerObserveSingleSelection = ViewersObservables.observeSingleSelection(cmbViewer);
		IObservableValue fModelCaseStudyNameObserveValue = BeansObservables.observeValue(fModel, "caseStudyName");
		bindingContext.bindValue(cmbViewerObserveSingleSelection, fModelCaseStudyNameObserveValue, null, null);
		//
		return bindingContext;
	}

	private void saveRawToFile(final Composite parent, String path) {
		final File file = new File(path);
		final String txt = txtRawOutput.getText();
		try {
			Writer writer = new BufferedWriter(new FileWriter(file));
			writer.write(txt);
			writer.close();
		} catch (IOException ex) {
			ErrorDialog.openError(
					parent.getShell(),
					"Exception while saving raw output",
					"Could not save raw output to " + path
						+ ":\n" + ex.getLocalizedMessage(),
					new Status(IStatus.ERROR, ID, IStatus.OK,
							"Could not save raw output", ex));
		}
	}

	private void saveChartToPDF(final Composite parent, final String path) {
		final File file = new File(path);
		final int width = 640;
		final int height = 480;

		Document document = new Document(new Rectangle(width, height));
		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
			document.open();
			PdfContentByte cb = writer.getDirectContent();
			PdfTemplate tp = cb.createTemplate(width, height);
			Graphics2D g2d = tp.createGraphics(width, height, new DefaultFontMapper());
			Rectangle2D r2d = new Rectangle2D.Double(0, 0, width, height);
			chartComposite.getChart().draw(g2d, r2d);
			g2d.dispose();
			cb.addTemplate(tp, 0, 0);
			document.close();
		} catch (Exception e) {
			ErrorDialog.openError(parent.getShell(),
					"Exception while generating PDF for chart",
					"Could not save chart to " + path + ":\n" + e.getLocalizedMessage(),
					new Status(IStatus.ERROR, ID, IStatus.OK,
							"Could not generate PDF from chart", e));
		}
	}

	/**
	 * Updates the raw output and graph with the dataset from the last completed
	 * job. Note: this method should be called from the SWT thread!
	 */
	private void updateResults(CaseStudyResult caseStudyResult) {
		// TODO implement
		chartComposite.setChart(caseStudyResult.getChart());
		chartComposite.forceRedraw();
		txtRawOutput.setText(caseStudyResult.getRawText());
	}
}