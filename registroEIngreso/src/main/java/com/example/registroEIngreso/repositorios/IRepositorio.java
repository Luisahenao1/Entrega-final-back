package com.example.registroEIngreso.repositorios;

import com.example.registroEIngreso.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorio extends JpaRepository<Usuario,Integer> {
}
