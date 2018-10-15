package submission.domain.common;

import java.util.ArrayList;
import java.util.List;

public class Documents {
	List<Document> documents=new ArrayList<Document>();

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Document documents) {
		this.documents.add(documents);
	}
}
