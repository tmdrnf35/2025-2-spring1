package com.sg.ai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloContrller {

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "안녕하세오, 이것은  이용희 교수가 2025년 10월14일 스프링으로 만든 페이지 입니다.";
	}
}
