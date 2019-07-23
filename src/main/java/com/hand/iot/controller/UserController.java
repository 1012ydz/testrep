package com.hand.iot.controller;

import com.hand.iot.entity.User;
import com.hand.iot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:ydz
 * @date:$
 */
@RestController
@RequestMapping("/user")
public class UserController {
	private UserRepository userReposotory;
	@Autowired
	public UserController(UserRepository userReposotory) {
		this.userReposotory = userReposotory;
	}
	@GetMapping
	public List<User> list(){
		return userReposotory.findAll();
	}
	@GetMapping("/{id}")
	public User query(@PathVariable Integer id){
		return userReposotory.findById(id).orElseThrow(IllegalAccessError::new);
	}
	@PostMapping
	public User create(@RequestBody @Validated User user, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			throw new IllegalArgumentException(bindingResult.toString());
		}
		return userReposotory.save(user);
	}
	@PutMapping
	public User update(@RequestBody User user){
		return userReposotory.save(user);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id){
		userReposotory.deleteById(id);
	}
}
