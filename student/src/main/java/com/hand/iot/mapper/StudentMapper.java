package com.hand.iot.mapper;

import com.hand.iot.bean.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @params:$
 * @return:$
 * @author:ydz
 * @date:$
 */
@Repository
public interface StudentMapper {
	public List<Student> find(@Param(value = "number") String number);
}
