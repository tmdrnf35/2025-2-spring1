// /sbb/src/main/java/com/sg/ai/MainController.java
// 2025.11.11
// 스프링프레임워크1 수업 내용

package com.sg.ai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		return "안녕하세요 sbb에 오신것을 환영합니다," + 
	           " 이 페이지는 최승환이 2025년 2학기 스프링 수업에서 만들었습니다";
	}
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}

}
