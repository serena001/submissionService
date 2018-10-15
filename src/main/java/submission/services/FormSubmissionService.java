package submission.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import submission.domain.common.FormSubmissionNumbers;
import submission.utils.JSONConversion;

@Service
public class FormSubmissionService {
	@Autowired
	JSONConversion objectToJSONConversion;
	@Autowired
	
	public String retrieveSubmissionCaseNumbers()
	{
		FormSubmissionNumbers formSubmissionNumbers = new FormSubmissionNumbers();
		formSubmissionNumbers.setCaseNumber("2017-001249");
		formSubmissionNumbers.setSubmissionNumber("2017-03-23-000001");
		return objectToJSONConversion.getWriteValueAsString(formSubmissionNumbers);		
	}
}
