package com.hand.iot.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author:ydz
 * @date:$
 */
@Entity
@Table(name = "DEMO_USER")
@JsonInclude(value= JsonInclude.Include.NON_NULL)
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	@NotBlank
	private String name;
	@Column
	@NotBlank
	private String account;
	@Column
	private String pwd;
	@Range(max = 100,min = 1,message = "您输入的值超出范围")
	private Integer age;

	public User(@NotBlank String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}

	public User() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}



	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
