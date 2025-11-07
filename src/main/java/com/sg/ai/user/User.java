package com.sg.ai.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User{
	public int id;
	private String username;
	private String password;
	private String email;
	
	
	


}

// 자바의 접근 제어자
// public < protected < default < private
