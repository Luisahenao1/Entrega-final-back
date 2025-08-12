package com.example.registroEIngreso.modelos;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String contraseña;

    private LocalDate fechaNacimiento;

    private String ciudad;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String contraseña, LocalDate fechaNacimiento, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
