package kr.ac.inhatc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcController {
	
	@RequestMapping("hello1")
	public String hello() {
		
		return "hello spring";
	}
	
}
