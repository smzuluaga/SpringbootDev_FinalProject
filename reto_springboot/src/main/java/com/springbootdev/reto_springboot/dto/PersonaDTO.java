package com.springbootdev.reto_springboot.dto;

public class PersonaDTO {

    private Integer id;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fullName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getFullName() {
        return this.nombres+" "+this.apellidoPaterno+" "+this.apellidoMaterno;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
