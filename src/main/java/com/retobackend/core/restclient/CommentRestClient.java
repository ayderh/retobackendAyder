package com.retobackend.core.restclient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.retobackend.core.model.MComment;
import com.retobackend.core.util.Constantes;

@Component("commentrestclient")
public class CommentRestClient {

	private RestTemplate restTemplate;

    public CommentRestClient() {
        this.restTemplate = new RestTemplate();
    }
	
    public MComment[] obtenerComentarios() {
        // Send request with GET method and default Headers.
//        String result = restTemplate.getForObject(URL_EMPLOYEES, String.class);
//        System.out.println(result);
    	MComment[] array = restTemplate.getForObject(Constantes.URL_SERVICIO, MComment[].class);
        return array;
    }
    
    
}
