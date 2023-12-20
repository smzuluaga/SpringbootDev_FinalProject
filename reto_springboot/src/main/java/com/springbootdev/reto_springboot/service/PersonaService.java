package com.springbootdev.reto_springboot.service;

import com.springbootdev.reto_springboot.dto.PersonaDTO;
import com.springbootdev.reto_springboot.entity.Persona;

import java.util.List;

public interface PersonaService {

    List<PersonaDTO> findAll();
    PersonaDTO findById(Integer id);
    PersonaDTO save(Persona persona);
    PersonaDTO update(Persona persona);

    PersonaDTO updateById (Integer id, Persona persona);
    void deleteById(Integer id);
    void deleteAll();
}
