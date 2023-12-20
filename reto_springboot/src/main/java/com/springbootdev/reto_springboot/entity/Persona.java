package com.springbootdev.reto_springboot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombres")
    private String nombres;
    @Column(name="apellido_paterno")
    private String apellidoPaterno;
    @Column(name="apellido_materno")
    private String apellidoMaterno;
    @Column(name="edad")
    private Integer edad;
}
