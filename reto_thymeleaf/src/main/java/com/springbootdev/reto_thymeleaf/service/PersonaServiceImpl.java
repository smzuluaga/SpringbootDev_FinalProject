package com.springbootdev.reto_thymeleaf.service;

import com.springbootdev.reto_thymeleaf.Client.PersonaClient;
import com.springbootdev.reto_thymeleaf.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    protected PersonaClient personaClient;


    @Override
    public List<Persona> findAll() {
        return personaClient.findAll();
    }

    @Override
    public Persona findById(Integer id) {
        return personaClient.findById(id);
    }

    @Override
    public Persona save(Persona persona) {
        return personaClient.save(persona);
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
        personaClient.deleteById(id);

    }
    @Override
    @Scheduled(cron = "0 */2 * * * *")
    public void deleteAll() {
        personaClient.deleteAll();

    }


}
