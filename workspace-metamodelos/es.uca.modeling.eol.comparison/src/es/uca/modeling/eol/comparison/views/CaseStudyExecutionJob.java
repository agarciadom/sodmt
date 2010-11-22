package es.uca.modeling.eol.comparison.views;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import es.uca.modeling.eol.comparison.model.CaseStudyResult;
import es.uca.modeling.eol.comparison.model.ICaseStudy;

final class CaseStudyExecutionJob extends Job {
	private ICaseStudy fCaseStudy;
	private CaseStudyResult fResult;

	CaseStudyExecutionJob(String name, ICaseStudy caseStudy) {
		super(name);
		fCaseStudy = caseStudy;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		fResult = fCaseStudy.run(monitor);
		return fResult.isSuccessful() ? Status.OK_STATUS : Status.CANCEL_STATUS;
	}

	public CaseStudyResult getCaseStudyResult() {
		return fResult;
	}
}