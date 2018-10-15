package submission;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import submission.Application;

@SpringBootApplication
public class Application{ 
	    public static void main(String[] args) {
	    	SpringApplication.run(Application.class);
	    }

	 @Bean
	  public FilterRegistrationBean corsFilter() {
		 FilterRegistrationBean registrationFilterBean = new FilterRegistrationBean();
		 registrationFilterBean.setFilter(new CorsFilter());
		 return registrationFilterBean;
	 }
}
