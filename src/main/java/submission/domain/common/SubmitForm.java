package submission.domain.common;

public class SubmitForm {
	String submissionNumber;
	String caseNumber;
	String formIdentifier;
	String submitOption;
	public String getSubmissionNumber() {
		return submissionNumber;
	}
	public void setSubmissionNumber(String submissionNumber) {
		this.submissionNumber = submissionNumber;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getFormIdentifier() {
		return formIdentifier;
	}
	public void setFormIdentifier(String formIdentifier) {
		this.formIdentifier = formIdentifier;
	}
	public String getSubmitOption() {
		return submitOption;
	}
	public void setSubmitOption(String submitOption) {
		this.submitOption = submitOption;
	}
	
}
