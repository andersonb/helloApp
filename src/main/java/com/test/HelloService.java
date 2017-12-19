package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	@Autowired
	private HelloRepository helloRepository;

	public List<Hello> findAll() {
		return helloRepository.findAll();
	}
	
	
	

}
