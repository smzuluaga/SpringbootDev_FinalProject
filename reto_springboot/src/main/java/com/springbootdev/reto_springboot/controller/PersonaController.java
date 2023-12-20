package com.springbootdev.reto_springboot.controller;

import com.springbootdev.reto_springboot.dto.PersonaDTO;
import com.springbootdev.reto_springboot.entity.Persona;
import com.springbootdev.reto_springboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

//    public PersonaController (PersonaService personaService){
//        this.personaService = personaService;
//    }


    @GetMapping
    public List<PersonaDTO> findAll(){
        return this.personaService.findAll();
    }

    @GetMapping("/{id}")
    public PersonaDTO findById(@PathVariable("id") Integer id){
        return this.personaService.findById(id);
    }

    @PostMapping
    public PersonaDTO save(@RequestBody Persona persona){
        return this.personaService.save(persona);
    }

    @PutMapping
    public PersonaDTO update(@RequestBody Persona persona){
        return this.personaService.update(persona);
    }

    @PutMapping("/{id}")
    public PersonaDTO updateById(@PathVariable("id") Integer id, @RequestBody Persona persona){

        return this.personaService.updateById(id,persona);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        personaService.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll(){
        personaService.deleteAll();
    }

}
