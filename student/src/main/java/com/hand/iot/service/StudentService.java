package com.hand.iot.service;


import com.hand.iot.bean.Student;

import java.util.List;

public interface StudentService {
	public List<Student> find(String number);
}
