package com.example.leninjahir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import com.example.leninjahir.entities.Jornada;
import com.example.leninjahir.repository.JornadaRepository;

public class JornadaService {

       @Autowired
    private JornadaRepository jornadaRepository;

    // Crear
    public Jornada save(Jornada entity) {
        return jornadaRepository.save(entity);
    }

    // Llamar por ID
    public Jornada findById(Long id) {
        return jornadaRepository.findById(id).orElse(null);
    }

    // Listar todos
    public List<Jornada> findAll() {
        return jornadaRepository.findAll();
    }

    // Eliminar por ID
    public void deleteById(Long id) {
        jornadaRepository.deleteById(id);
    }

    //parcial
     public ResponseEntity<Jornada> updateById(Long id, Jornada jornadaUpdate){
        try{
            Jornada jornadaExist = findById(id);
            if(jornadaExist == null) return ResponseEntity.notFound().build();

            if (jornadaUpdate.getNombre() != null) jornadaExist.setNombre(jornadaUpdate.getNombre());
          

            Jornada jornadaSave = save(jornadaExist);
            return ResponseEntity.ok(jornadaSave);
         }catch (Exception e){
            return ResponseEntity.internalServerError().build();
         }
    }
    
}
