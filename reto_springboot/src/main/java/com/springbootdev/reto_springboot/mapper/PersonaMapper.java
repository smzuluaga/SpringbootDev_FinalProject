package com.springbootdev.reto_springboot.mapper;

import com.springbootdev.reto_springboot.dto.PersonaDTO;
import com.springbootdev.reto_springboot.entity.Persona;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonaMapper {

    public PersonaDTO toDTO(Persona persona){

        PersonaDTO personaDTO = new PersonaDTO();

        BeanUtils.copyProperties(persona, personaDTO);

        return personaDTO;
    }

    public List<PersonaDTO> toDTOList(List<Persona> personaList){

        List<PersonaDTO> personaDTOList = personaList.stream().map(s->toDTO(s)).collect(Collectors.toList());

        return personaDTOList;
    }
}
