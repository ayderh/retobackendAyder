package com.retobackend.core.converter;

import org.springframework.stereotype.Component;

import com.retobackend.core.model.MComment;
import com.retobackend.core.model.MCommentNew;

import java.util.ArrayList;
import java.util.List;

@Component("convertidor")
public class Convertidor {
	
	public List<MCommentNew> convertirListaComentarios(List<MComment> comentarios){
		List<MCommentNew> comentariosNuevos= new ArrayList<>();
		
		for (MComment mComment : comentarios) {
			comentariosNuevos.add(new MCommentNew(mComment));
		}
		return comentariosNuevos;
	}

	public List<MCommentNew> convertirListaComentarios(MComment[] comentarios){
		List<MCommentNew> comentariosNuevos= new ArrayList<>();
		
		for (MComment mComment : comentarios) {
			comentariosNuevos.add(new MCommentNew(mComment));
		}
		return comentariosNuevos;
	}
	
}