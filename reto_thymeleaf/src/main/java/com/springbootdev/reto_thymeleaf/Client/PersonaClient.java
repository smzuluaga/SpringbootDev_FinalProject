package com.springbootdev.reto_thymeleaf.Client;

import com.springbootdev.reto_thymeleaf.model.Persona;

import java.util.List;

public interface PersonaClient{

    List<Persona> findAll();
    Persona findById(Integer id);
    Persona save(Persona persona);
//    Persona update(Persona persona);
//    Persona updateById (Integer id, Persona persona);
    void deleteById(Integer id);
    void deleteAll();

}
