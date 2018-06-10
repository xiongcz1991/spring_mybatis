package com.xiongcz.hello1.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xiongcz.pojo.User;
/**
*TEST
*
*/
@Controller
public class HelloWorld {
	
	@ModelAttribute
	public void setUser(Model model) {
		User user = new User("xiongcz", "china");
		model.addAttribute("command", user);
	}

	@RequestMapping({"/hello","/"})
	public String sayHello(@RequestParam(value="name",required=false)String name,HttpServletRequest req) {
		req.setAttribute("name", name);
		return "hello";
	}
	
	@RequestMapping("/login")
	public String login (User user,Model model) {
		System.out.println(user);
		System.out.println(model.asMap().get("command"));
		user.setName("joker");
		System.out.println(model.asMap().get("command"));
		return "success";
	}
	
	@RequestMapping("/form")
	public String form (User user,Model model) {
		System.out.println(user);
		System.out.println(model.asMap().get("command"));
		user.setName("joker");
		System.out.println(model.asMap().get("command"));
		return "spring_from";
	}
	
}
