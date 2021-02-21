package com.retobackend.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.retobackend.core.restclient.CommentRestClient;
import com.retobackend.core.util.Utilidades;
import com.retobackend.core.converter.Convertidor;
import com.retobackend.core.model.MComment;
import com.retobackend.core.model.MCommentNew;

@Service("servicioComment")
public class CommentService {

	@Autowired
	@Qualifier("commentrestclient")
	CommentRestClient commentrestclient;
	
	
	@Autowired
	@Qualifier("convertidor")
	Convertidor convertidor;
	

	
	public List<MCommentNew> obtenerNuevosCommentarios() {
		//List<MComment> comentariosOld= commentrestclient.obtenerComentarios();
		MComment[] comentariosOld= commentrestclient.obtenerComentarios();
		return convertidor.convertirListaComentarios( (comentariosOld) );
	}
	
	
}



