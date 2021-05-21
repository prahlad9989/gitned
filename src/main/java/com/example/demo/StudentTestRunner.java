package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@Component("mo")
public class StudentTestRunner  {

	@Autowired
	StudentRepository ss;
	
	@RequestMapping("/")
	public String sendData() {
		return "index.jsp";
		
	}
	
	@RequestMapping("/add")
	public String sendData1(Student s) {
		ss.save(s);
		return "index.jsp";
		
	}
	@RequestMapping("/register")
	public String reg(Student s) {
		ss.save(s);
		return "StudentRegister.jsp";
		
	}

	
		}

	

