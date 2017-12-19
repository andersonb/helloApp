package com.test;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResource {
	
	
	@Autowired
	private HelloService helloService;
	
	
	@RequestMapping( method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> hello(){
		
		List<Hello> helloList = helloService.findAll();
		
		
		return new ResponseEntity<List<Hello>>(helloList,null, HttpStatus.OK);
		
		
		
	}

}
