package es.uca.modeling.eol.comparison.views;


import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.grouplayout.GroupLayout;
import org.eclipse.swt.layout.grouplayout.LayoutStyle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.jfree.experimental.chart.swt.ChartComposite;

import es.uca.modeling.eol.comparison.charts.TimeChartFactory;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;

/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */
public class PerformanceComparisonView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "es.uca.modeling.eol.comparison.views.PerformanceComparisonView";
	private Table tblParams;
	private Text txtRawOutput;

	/**
	 * The constructor.
	 */
	public PerformanceComparisonView() {}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		
		Label lblCase = new Label(parent, SWT.NONE);
		lblCase.setAlignment(SWT.RIGHT);
		lblCase.setText("Case study:");
		
		ComboViewer comboViewer = new ComboViewer(parent, SWT.NONE);
		Combo cmbCaseStudy = comboViewer.getCombo();
		cmbCaseStudy.setItems(new String[] {"Sequence", "Dense"});
		cmbCaseStudy.select(0);
		
		Label lblParams = new Label(parent, SWT.NONE);
		lblParams.setText("Parameters");
		
		TableViewer tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
		tblParams = tableViewer.getTable();
		
		Button btnRun = new Button(parent, SWT.NONE);
		btnRun.setText("Run");
		
		Label lblOutput = new Label(parent, SWT.NONE);
		lblOutput.setText("Raw output");
		
				txtRawOutput = new Text(parent, SWT.BORDER);
		
		Button btnSaveRaw = new Button(parent, SWT.NONE);
		btnSaveRaw.setText("Save Raw...");
		
		Button btnSaveChart = new Button(parent, SWT.NONE);
		btnSaveChart.setText("Save Chart...");
		
		ChartComposite chartComposite = TimeChartFactory.createChart(parent);

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
}