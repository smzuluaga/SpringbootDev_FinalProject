package com.springbootdev.reto_thymeleaf.service;

import com.springbootdev.reto_thymeleaf.Client.PersonaClient;
import com.springbootdev.reto_thymeleaf.model.Persona;
import com.springbootdev.reto_thymeleaf.model.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    protected PersonaClient personaClient;

    protected Timer timeDelete_setup;

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
//    @Scheduled(cron = "0 */5 * * * *")
    @Scheduled(cron = "#{generadorCron()}")
    public void deleteAll() {
        personaClient.deleteAll();

    }

    private String generadorCron(){
        timeDelete_setup.setSegundos("*");
        timeDelete_setup.setMinutos("*");
        timeDelete_setup.setHoras("*");
        timeDelete_setup.setDiaDelMes("*");
        timeDelete_setup.setMes("*");
        timeDelete_setup.setDiaDeLaSemana("*");

        return timeDelete_setup.getSegundos() + " " + timeDelete_setup.getMinutos() + " " + timeDelete_setup.getHoras() + " " + timeDelete_setup.getDiaDelMes() + " " + timeDelete_setup.getMes() + " " + timeDelete_setup.getDiaDeLaSemana();
    }
}
