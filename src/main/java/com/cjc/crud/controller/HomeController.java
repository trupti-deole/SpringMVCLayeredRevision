package com.cjc.crud.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.crud.model.Student;
import com.cjc.crud.serviceI.HomeService;
@Controller
public class HomeController {
	@Autowired
	private HomeService service; 
	
	
	@RequestMapping(value="/")
	public String LandingPage()
	{
		return "index";
	}
	
	@RequestMapping(value="/reg")
	public String regPage()
	{
		return "register";
	}
	
	@RequestMapping(value="/register")
	public String registerPage(@ModelAttribute Student stud,Model m)
	{
		service.saveData(stud);
		return "login";
	}
	@RequestMapping(value="/login")
	public String loginPage(@RequestParam String uname,@RequestParam String pass,Model m)
	{
		List<Student> studList=(List<Student>)service.loginCheck(uname, pass);
		System.out.println(studList);
		return "register";
	}
	
	
	
}
