package submission.domain.common;

public class Document {
	String infoResourceTitle;
	String lkpInfoResourceTypeId;
	String fileName;
	String fileDataUrl;
	public String getInfoResourceTitle() {
		return infoResourceTitle;
	}
	public void setInfoResourceTitle(String infoResourceTitle) {
		this.infoResourceTitle = infoResourceTitle;
	}
	public String getLkpInfoResourceTypeId() {
		return lkpInfoResourceTypeId;
	}
	public void setLkpInfoResourceTypeId(String lkpInfoResourceTypeId) {
		this.lkpInfoResourceTypeId = lkpInfoResourceTypeId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileDataUrl() {
		return fileDataUrl;
	}
	public void setFileDataUrl(String fileDataUrl) {
		this.fileDataUrl = fileDataUrl;
	}
	
}
