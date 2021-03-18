package kr.ac.inhatc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	@RequestMapping("inhatc")
	public String inhatc() {		
		return "http://www.inhatc.ac.kr/";
	}
	
	@RequestMapping("name")
	public String name(String id) {		
		return "당신의 학번은 : "+id;
	}
	@RequestMapping("hello")
	public String hello(int num) {		
		String temp = "";
		for (int i=1;i<10;i++){
			temp += num+"*"+i+"="+num*i+" ";
		}
		return temp;
	}
}
