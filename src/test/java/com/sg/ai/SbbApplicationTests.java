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
	void textJpa() {
		Question q1 = new Question();
		q1.setSubject("sbb가 뭔가요?");
		q1.setContent("오늘은 11월 7일입니다");
		q1.setCreatdate(LocalDateTime.now());
		this.questionRepository.save(q1);
		
		Question q2 = new Question();
		q2.setSubject("오늘 날씨는 어떤가요");
		q2.setContent("날씨는 가을날씨로 좋아요");
		q2.setCreatdate(LocalDateTime.now());
		this.questionRepository.save(q2);
		

	
		
	}

}
