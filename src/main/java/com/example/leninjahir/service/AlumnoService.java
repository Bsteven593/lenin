package com.example.leninjahir.service;


import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.leninjahir.repository.AlumnoRepository;
import com.example.leninjahir.entities.Alumno;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    // Crear
    public Alumno save(Alumno entity) {
        return alumnoRepository.save(entity);
    }

    // Llamar por ID
    public Alumno findById(Long id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    // Listar todos
    public List<Alumno> findAll() {
        return alumnoRepository.findAll();
    }

    // Eliminar por ID
    public void deleteById(Long id) {
        alumnoRepository.deleteById(id);
    }
}