package com.sg.ai.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sg.ai.user.User;

@org.springframework.web.bind.annotation.RestController
public class RestController {

//	@GetMapping("/jblog")
//	public User httpGet() {
//		User finduser = User.builder().id(1).username("ai").password("222").email("g@gmail.com").build();
//		return finduser;	
//	}
	
	// User.builder()에서 에러가 나면
	@GetMapping("/jblog")
	public String httpGet() {
				return "Get 요청";	
	}
	
	// Rest 방식 4가지
	// Get, Post, Put, Delete
	@PostMapping("/jblog")
	public String httpPost(@RequestBody User user) {
		
		return "Post 요청" + user.toString();
	}
	
	@PutMapping("/jblog")
	public String httpPut() {
		return "Put 요청";
	}
	
	@DeleteMapping("/jblog")
	public String httpDelete() {
		return "Delete 요청";
	}
		 
}