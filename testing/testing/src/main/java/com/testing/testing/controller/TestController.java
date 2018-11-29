package com.testing.testing.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
	
	@GetMapping(value = "/test")
	public List<String> getTestData(){
		List<String> list = new ArrayList<>();
		list.add("first");
		list.add("second");
		list.add("third");
		return list;
	}

}
