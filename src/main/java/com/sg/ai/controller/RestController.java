package com.sg.ai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sg.ai.user.User;

@Controller
public class RestController {

    // 문자열을 그대로 응답으로 내려보내기
    @ResponseBody
    @GetMapping("/jblog")
    public String httpGet() {
        return "Get 요청";
    }

    // JSON 바디를 받아 문자열로 응답
    @ResponseBody
    @PostMapping("/jblog")
    public String httpPost(@RequestBody User user) {
        return "Post 요청 " + user.toString();
    }

    @ResponseBody
    @PutMapping("/jblog")
    public String httpPut() {
        return "Put 요청";
    }

    @ResponseBody
    @DeleteMapping("/jblog")
    public String httpDelete() {
        return "Delete 요청";
    }
}
