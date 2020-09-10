package com.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {

	@RequestMapping("/")
	public @ResponseBody String home() throws Exception {
		return "hello world";
	}
	
	
	@RequestMapping("/test") 
	public ModelAndView test() throws Exception { 
		ModelAndView mav = new ModelAndView("test"); 
		mav.addObject("name", "goddaehee");
		
		List<String> testList = new ArrayList<String>(); 
		testList.add("a"); 
		testList.add("b"); 
		testList.add("c"); 
		mav.addObject("list", testList);
		
		return mav; 
	}	
}
