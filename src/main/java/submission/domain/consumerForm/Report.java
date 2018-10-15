package submission.domain.consumerForm;

public class Report {
	String report;
	String lkpReportTypeId;
	String lkpGovernanceId;
	String lkpPurposeId;
	String caseNo;
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public String getLkpReportTypeId() {
		return lkpReportTypeId;
	}
	public void setLkpReportTypeId(String lkpReportTypeId) {
		this.lkpReportTypeId = lkpReportTypeId;
	}
	public String getLkpGovernanceId() {
		return lkpGovernanceId;
	}
	public void setLkpGovernanceId(String lkpGovernanceId) {
		this.lkpGovernanceId = lkpGovernanceId;
	}
	public String getLkpPurposeId() {
		return lkpPurposeId;
	}
	public void setLkpPurposeId(String lkpPurposeId) {
		this.lkpPurposeId = lkpPurposeId;
	}
	public String getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}
	
}
