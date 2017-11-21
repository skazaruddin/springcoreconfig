package org.sdrc.yourappname.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebController {

	//@PreAuthorize("hasRole('data_entry,view')")
	@PreAuthorize("hasRole('CWC:data_entry,view')")
	@RequestMapping("/test")
	public String hello() {
		return "hello";
	}

	

}
