package com.retobackend.core;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.retobackend.core.restclient.CommentRestClient;
import com.retobackend.core.service.CommentService;


@SpringBootTest
public class CommentServiceTest {

	@Autowired
	CommentRestClient commentRestClient;
	
	@Autowired
	CommentService commentService;

	@Test
	void contextLoads() {
	}
	
	@Test
	void whenGetCommentsFromRestClientInterace_thenShowListSize() {
		
		Assertions.assertThat(commentRestClient.obtenerComentarios().length);
	}
	
	@Test
	void whenGetCommentsFromServiceInterace_thenShowListSize() {
		
		Assertions.assertThat(commentService.obtenerNuevosCommentarios().size());
	}
	
}



