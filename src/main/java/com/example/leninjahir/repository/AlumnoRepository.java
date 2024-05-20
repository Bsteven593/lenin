package com.example.leninjahir.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.leninjahir.entities.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
    List<Alumno> findAll();
}
