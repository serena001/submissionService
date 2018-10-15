package submission.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import submission.domain.common.Document;
import submission.domain.common.Documents;
import submission.domain.common.Form;
import submission.domain.common.Submission;
import submission.domain.consumerForm.AffectedPersons;
import submission.domain.consumerForm.Incident;
import submission.domain.consumerForm.Product;
import submission.domain.consumerForm.ProductLabel;
import submission.domain.consumerForm.Report;
import submission.domain.consumerForm.Submitter;
import submission.domain.consumerForm.WhereGotPrdct;
import submission.utils.JSONConversion;
@Service
public class ConsumerFormService {
	@Autowired
	JSONConversion jsonConversion;

	Documents documents;
	Form form;
	Submission submission;
	AffectedPersons affectedPersons;
	Incident incident;
	Product product;
	ProductLabel productLabel;
	Report report;
	Submitter submitter;
	WhereGotPrdct whereGotPrdct;
	
	public void convertJSONStrToObjects(String jsonString)
	{
		
		String jsonSingleStr = jsonConversion.retrieveJSONStringValueFromJson(jsonString, "documents");
		System.out.println("document"+jsonSingleStr);
		Documents documents = new Documents();
		jsonConversion.convertJSONToObject(documents,  jsonSingleStr);

	/**	jsonConversion.convertJSONToObject(form, jsonString, "form");
		jsonConversion.convertJSONToObject(submission, jsonString, "submission");
		jsonConversion.convertJSONToObject(affectedPersons, jsonString, "affectedPersons");
		jsonConversion.convertJSONToObject(incident, jsonString, "incident");
		jsonConversion.convertJSONToObject(product, jsonString, "product");
		jsonConversion.convertJSONToObject(productLabel, jsonString, "productLabel");
		jsonConversion.convertJSONToObject(report, jsonString, "report");
		jsonConversion.convertJSONToObject(submitter, jsonString, "submitter");
		jsonConversion.convertJSONToObject(whereGotPrdct, jsonString, "whereGotPrdct");**/
	}
}
