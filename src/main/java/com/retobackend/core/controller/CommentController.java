package com.retobackend.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.retobackend.core.model.MCommentNew;
import com.retobackend.core.service.CommentService;

@RestController
@RequestMapping("v1")
public class CommentController {

	@Autowired
	@Qualifier("servicioComment")
	CommentService service;

	
	@PostMapping("/comentarios")
	public List<MCommentNew> obtener() {
		return service.obtenerNuevosCommentarios();

	}

}
