package com.hand.iot.controller;

import com.hand.iot.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @params:$
 * @return:$
 * @author:ydz
 * @date:$
 */
@Controller
public class HelloController {
	private final String DEMO_SERVICE_ID="student-service";
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "number",required = false)String number, Model model){

		Student student=restTemplate.getForObject("http://"+DEMO_SERVICE_ID+"/getName?number="+number, Student.class);
		System.out.println("进入项目："+student);
		model.addAttribute("name", student.getName());
		return "hello";
	}

}
