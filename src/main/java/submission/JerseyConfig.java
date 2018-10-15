package submission;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import submission.controller.SubmissionController;
@Component
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig() {
		register(SubmissionController.class);
	}
}
