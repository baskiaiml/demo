/**
 * 
 */
package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 91994
 *
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

	@ResponseBody
	@GetMapping("/healthcheck")
	public ResponseEntity<Object> healthCheck() {
		
		return new ResponseEntity<Object>("{\"status\":\"Spring Example Service is working\"}", HttpStatus.ACCEPTED);
	}
	
	@ResponseBody
	@GetMapping("/service")
	public ResponseEntity<Object> demoService() {
		
		return new ResponseEntity<Object>("{\"status\":\"Demo Service is working\"}", HttpStatus.ACCEPTED);
	}
}
