package com.example.leninjahir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leninjahir.entities.Curso;
import com.example.leninjahir.repository.CursoRepository;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository; 

    public Curso save(Curso entity){
        return cursoRepository.save(entity);
    }

}
