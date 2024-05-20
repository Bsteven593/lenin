package com.example.leninjahir.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.example.leninjahir.entities.Jornada;

public interface JornadaRepository extends CrudRepository<Jornada, Long> {
    List<Jornada> findAll();
}
