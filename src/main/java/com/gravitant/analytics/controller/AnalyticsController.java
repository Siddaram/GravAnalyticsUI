package com.gravitant.analytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;



import com.gravitant.analytics.rest.adapter.RestAdapter;
import com.gravitant.s3.model.S3Credential;

@Controller
@SuppressWarnings("deprecation")
public class AnalyticsController extends SimpleFormController {
	
	@Autowired	
	private RestAdapter restAdapter;
	
	public AnalyticsController() {
		setCommandClass(S3Credential.class);
		System.out.println("Grav User controller");
		setCommandName("credential");
		System.out.println("credential");
	}
	
	
	@RequestMapping(value = "/userRegistration",method = RequestMethod.POST)
	protected ModelAndView onSubmit(Object command) throws Exception
	{
		S3Credential credential = (S3Credential) command;
		System.out.println("Credentials -- "+credential.getUserName());
		restAdapter.registerS3User(credential);
		
//		adapter.registerS3User(credential);
		// userService.add(user);
		System.out.println("model and view");
		return new ModelAndView("successPage", "user", credential);

	}
	
	

}
