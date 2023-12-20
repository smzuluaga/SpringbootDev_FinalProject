package com.springbootdev.reto_thymeleaf.controller;

import com.springbootdev.reto_thymeleaf.model.Persona;
import com.springbootdev.reto_thymeleaf.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class PersonaController {

    @Autowired
    protected PersonaService personaService;

    @GetMapping("/")
    public String toProducto (Model model){

        List<Persona> personaList = personaService.findAll();

        model.addAttribute("personas",personaList);

        return "/personas";
    }

    @GetMapping("/nuevo")
    public String toNuevo (Persona persona,Model model){

        model.addAttribute("persona", persona);

        return "/formulariopersonas";

    }

    @PostMapping("/nuevo/guardar")
    public String save(Persona persona, Model model){
         personaService.save(persona);

         List<Persona> personaList = personaService.findAll();
         model.addAttribute("personas", personaList);

        return "/personas";
    }

    @GetMapping("/modificar/{id}")
    public String modify (@PathVariable("id") Integer id, Model model){

        Persona persona = personaService.findById(id);

        model.addAttribute("persona", persona);

        return "/formulariopersonas";

    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable("id") Integer id, Model model){

        personaService.deleteById(id);

        List <Persona> personaList = personaService.findAll();
        model.addAttribute("personas", personaList);
        return "/personas";
    }


}
