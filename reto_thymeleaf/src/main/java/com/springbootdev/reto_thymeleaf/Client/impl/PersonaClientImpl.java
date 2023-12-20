package com.springbootdev.reto_thymeleaf.Client.impl;

import com.springbootdev.reto_thymeleaf.Client.PersonaClient;
import com.springbootdev.reto_thymeleaf.model.Persona;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class PersonaClientImpl implements PersonaClient {
    private RestTemplate restTemplate;

    @Override
    public List<Persona> findAll() {

        restTemplate = new RestTemplate();

        String url = "http://localhost:8086/personas";

        ResponseEntity<?> responseEntity = restTemplate.getForEntity(url,Persona[].class);

        Persona[] personas =  (Persona[]) responseEntity.getBody();

        List<Persona> personaList = Arrays.asList(personas);

        return personaList;
    }

    @Override
    public Persona findById(Integer id) {

        restTemplate = new RestTemplate();

        String url = "http://localhost:8086/personas/"+id;

        ResponseEntity<?> responseEntity = restTemplate.getForEntity(url,Persona.class);

        Persona persona1 = (Persona) responseEntity.getBody();


        return persona1;
    }

    @Override
    public Persona save(Persona persona) {

        restTemplate = new RestTemplate();

        String url = "http://localhost:8086/personas";

        ResponseEntity<?> responseEntity = restTemplate.postForEntity(url,persona,Persona.class);

        Persona persona1 = (Persona) responseEntity.getBody();

        return persona1;
    }

//    @Override
//    public Persona update(Persona persona) {
//        return null;
//    }
//
//    @Override
//    public Persona updateById(Integer id, Persona persona) {
//        return null;
//    }

    @Override
    public void deleteById(Integer id) {

        restTemplate = new RestTemplate();

        String url = "http://localhost:8086/personas/"+id;


        restTemplate.delete(url);


    }

    @Override
    public void deleteAll() {

        restTemplate = new RestTemplate();

        String url = "http://localhost:8086/personas";


        restTemplate.delete(url);


    }
}
