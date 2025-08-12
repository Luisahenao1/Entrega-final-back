package com.example.registroEIngreso.servicios;


import com.example.registroEIngreso.modelos.Usuario;
import com.example.registroEIngreso.repositorios.IRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario {

    @Autowired
    IRepositorio repositorio;

    public boolean guardar(Usuario datosDelUsuario){
        repositorio.save(datosDelUsuario);
        return true;
    }

}
