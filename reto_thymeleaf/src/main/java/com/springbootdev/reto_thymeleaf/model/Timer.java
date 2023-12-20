package com.springbootdev.reto_thymeleaf.model;

public class Timer {

    private String segundos = "*";
    private String minutos = "*";
    private  String horas = "*";
    private String diaDelMes = "*";
    private String mes = "*";
    private String diaDeLaSemana = "*";

    public String getSegundos() {
        return segundos;
    }

    public void setSegundos(String segundos) {
        this.segundos = segundos;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getDiaDelMes() {
        return diaDelMes;
    }

    public void setDiaDelMes(String diaDelMes) {
        this.diaDelMes = diaDelMes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDiaDeLaSemana() {
        return diaDeLaSemana;
    }

    public void setDiaDeLaSemana(String diaDeLaSemana) {
        this.diaDeLaSemana = diaDeLaSemana;
    }
}
