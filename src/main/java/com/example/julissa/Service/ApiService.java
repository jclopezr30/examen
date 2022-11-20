package com.example.julissa.Service;

import com.example.julissa.Modelo.dto.Categoria;


import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;

@Service
public class ApiService {

    private String server = "http://localhost:9090/categoria/";
    private String usuario = "user";
    private String clave = "1234";

    public List<Categoria> obtenerTodo() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add(new BasicAuthenticationInterceptor(usuario,clave));
        ResponseEntity<Categoria[]> responseEntity = restTemplate.
                getForEntity(server + "todo", Categoria[].class);
        return Arrays.asList(responseEntity.getBody());
    }
}
