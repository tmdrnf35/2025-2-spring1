package com.sg.ai;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sg.ai.question.Question;
import com.sg.ai.question.QuestionRepository;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		Question q1 = new Question();
		q1.setSubject("오늘이 며칠인가요?");
		q1.setContent("오늘은 11월7일 목요일입니다");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);
		
		Question q2 = new Question();
		q2.setSubject("오늘 날씨는 어떤가요");
		q2.setContent("가을날씨처럼 화창해요");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
		
	}

}