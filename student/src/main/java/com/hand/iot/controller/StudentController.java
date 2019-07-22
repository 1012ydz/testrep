package com.hand.iot.controller;

import com.hand.iot.bean.Student;
import com.hand.iot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Value("${server.port}")
	private int port;

	@RequestMapping("/student")
	public  String student(@RequestParam(value ="number",required = false)String number, Model model){
		if(number==null && number.isEmpty()){
			model.addAttribute("msg", "学号不能为空");
			return "error";
		}
		List<Student> studentList=studentService.find(number);
		if (studentList!=null ){
			if(studentList.size()>0){
				Student student=studentList.get(0);
				model.addAttribute("number", student.getNumber()+"端口号："+String.format("form %d", port));
				model.addAttribute("name", student.getName());

			}
		}
		return "student";

	}
	@RequestMapping("getName")
	@ResponseBody
	public Student getName(@RequestParam(value = "number")String number,Model model){
		List<Student> studentList=studentService.find(number);
		Student student=studentList.get(0);
		student.setName(student.getName()+String.format("from %d", port));
		return student;
	}

}
