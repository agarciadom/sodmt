package es.uca.modeling.eol.comparison.views;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import es.uca.modeling.eol.comparison.model.CaseStudyResult;
import es.uca.modeling.eol.comparison.model.ICaseStudy;

/**
 * Eclipse background job for running the case study.
 *
 * @author Antonio García-Domínguez
 * @version 1.0
 */
final class CaseStudyExecutionJob extends Job {
	private ICaseStudy fCaseStudy;
	private CaseStudyResult fResult;

	CaseStudyExecutionJob(String name, ICaseStudy caseStudy, CaseStudyResult caseStudyResult) {
		super(name);
		fCaseStudy = caseStudy;
		fResult = caseStudyResult;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		fCaseStudy.run(monitor, fResult);
		return fResult.isSuccessful() ? Status.OK_STATUS : Status.CANCEL_STATUS;
	}

}