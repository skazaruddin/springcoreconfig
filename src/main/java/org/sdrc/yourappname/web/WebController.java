package org.sdrc.yourappname.web;

import org.sdrc.service.RestExceptionHandlerService;
import org.sdrc.yourappname.exceptions.CustomDateParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebController {

	@Autowired
	RestExceptionHandlerService restExceptionHandlerService;
	
	//@PreAuthorize("hasRole('data_entry,view')")

//	@PreAuthorize("hasRole('CWC:data_entry,view')")
	@RequestMapping("/testTypeOne")
	public String hello() {
		return "Hello, I am using (Role:Feature,Permission)";
	}
	
	
	@PreAuthorize("hasRole('data_entry,view')")
	@RequestMapping("/testTypeTwo")
	public String sayHello() {
		return "Hello, I am using (Feature,Permission)";
	}
	
	@RequestMapping("/exceptionHandlerTest")
	public String exceptionHandlerTest(@RequestParam String name) {
		restExceptionHandlerService.parseDate("123");
		return "test";
	}

	

}
