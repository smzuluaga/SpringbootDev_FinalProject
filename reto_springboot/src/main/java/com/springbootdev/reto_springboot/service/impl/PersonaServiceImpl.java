package com.springbootdev.reto_springboot.service.impl;

import com.springbootdev.reto_springboot.controller.PersonaController;
import com.springbootdev.reto_springboot.dto.PersonaDTO;
import com.springbootdev.reto_springboot.entity.Persona;
import com.springbootdev.reto_springboot.mapper.PersonaMapper;
import com.springbootdev.reto_springboot.repository.PersonaRepository;
import com.springbootdev.reto_springboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PersonaMapper personaMapper;

    @Override
    public List<PersonaDTO> findAll() {

        List<Persona> listaPersonas = personaRepository.findAll();

        List<PersonaDTO> listaPersonasDTO = personaMapper.toDTOList(listaPersonas);

        return listaPersonasDTO;
    }

    @Override
    public PersonaDTO findById(Integer id) {

        Optional<Persona> persona = personaRepository.findById(id);
        PersonaDTO personaDTO = personaMapper.toDTO(persona.get());
        return personaDTO;
    }

    @Override
    public PersonaDTO save(Persona persona) {
        personaRepository.save(persona);

        PersonaDTO personaDTO = personaMapper.toDTO(persona);
        return personaDTO;
    }

    @Override
    public PersonaDTO update(Persona persona) {

        personaRepository.save(persona);

        PersonaDTO personaDTO = personaMapper.toDTO(persona);
        return personaDTO;
    }

    @Override
    public void deleteById(Integer id) {
        personaRepository.deleteById(id);
    }

    @Override
//    @Scheduled(cron = "0 */5 * * * *")
    public void deleteAll() {
        personaRepository.deleteAll();
    }

    @Override
    public PersonaDTO updateById(Integer id, Persona persona) {

        persona.setId(id);
        personaRepository.save(persona);
        PersonaDTO personaDTO = personaMapper.toDTO(persona);

        return personaDTO;
    }
}
