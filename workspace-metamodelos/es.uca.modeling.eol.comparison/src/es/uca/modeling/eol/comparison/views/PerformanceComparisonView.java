package es.uca.modeling.eol.comparison.views;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.grouplayout.GroupLayout;
import org.eclipse.swt.layout.grouplayout.LayoutStyle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.jfree.experimental.chart.swt.ChartComposite;

import es.uca.modeling.eol.comparison.Activator;
import es.uca.modeling.eol.comparison.charts.TimeChartFactory;
import es.uca.modeling.eol.comparison.model.CaseStudyConfigurationModel;
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
	private static class CaseStudyLabelProvider extends LabelProvider {
		public Image getImage(Object element) {
			return super.getImage(element);
		}
		public String getText(Object element) {
			return super.getText(element);
		}
	}
	private static class CaseStudyContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object inputElement) {
			final CaseStudyConfigurationModel model = (CaseStudyConfigurationModel)inputElement;
			return model.getCaseStudies().toArray();
		}
		public void dispose() {}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {}
	}
	private static class ParameterContentProvider implements IStructuredContentProvider, PropertyChangeListener {
		private Viewer fViewer;

		public Object[] getElements(Object inputElement) {
			final CaseStudyConfigurationModel model = (CaseStudyConfigurationModel)inputElement;
			return model.getParameters().toArray();
		}

		public void dispose() {}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			fViewer = viewer;
			if (oldInput != null) {
				((CaseStudyConfigurationModel)oldInput).removePropertyChangeListener(this);
			}
			if (newInput != null) {
				((CaseStudyConfigurationModel)newInput).addPropertyChangeListener(
						CaseStudyConfigurationModel.PROPEV_NAME, this);
			}
		}

		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			fViewer.refresh();
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

	private void initLaunchers(Composite parent) {
		btnRun = new Button(parent, SWT.NONE);
		btnRun.setText("Run");

		btnSaveRaw = new Button(parent, SWT.NONE);
		btnSaveRaw.setText("Save Raw...");

		btnSaveChart = new Button(parent, SWT.NONE);
		btnSaveChart.setText("Save Chart...");
	}

	private void initChart(Composite parent) {
		chartComposite = TimeChartFactory.createChart(parent);
	}

	private void initRawOutput(Composite parent) {
		lblOutput = new Label(parent, SWT.NONE);
		lblOutput.setText("Raw output");
		txtRawOutput = new Text(parent, SWT.BORDER | SWT.READ_ONLY | SWT.WRAP | SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL | SWT.MULTI);
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
	public void setFocus() {
		tblParams.setFocus();
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue cmbViewerObserveSingleSelection = ViewersObservables.observeSingleSelection(cmbViewer);
		IObservableValue fModelCaseStudyNameObserveValue = BeansObservables.observeValue(fModel, "caseStudyName");
		bindingContext.bindValue(cmbViewerObserveSingleSelection, fModelCaseStudyNameObserveValue, null, null);
		//
		return bindingContext;
	}
}