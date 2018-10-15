package submission.controller;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import submission.services.ConsumerFormService;
import submission.services.FormSubmissionService;

@Path("/")
@Component
public class SubmissionController {
	@Autowired
	FormSubmissionService formSubmissionService;
	@Autowired
	ConsumerFormService consumerFormService;
	
	@POST
	@Path("/formSubmit")
	@ResponseBody
	public String submitForm(@RequestBody @NotNull String jsonValue, @QueryParam("form") @NotNull String form)
	{
		consumerFormService.convertJSONStrToObjects(jsonValue);
		return formSubmissionService.retrieveSubmissionCaseNumbers();
	}
}
