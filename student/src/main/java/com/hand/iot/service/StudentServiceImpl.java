package com.hand.iot.service;

import com.hand.iot.bean.Student;
import com.hand.iot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @params:$
 * @return:$
 * @author:ydz
 * @date:$
 */@Service
public class StudentServiceImpl  implements StudentService{
 	@Autowired
 	private StudentMapper studentMapper;
	@Override
	public List<Student> find(String number) {
		return studentMapper.find(number);
	}
}
