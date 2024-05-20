package com.example.leninjahir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    // Llamar por ID
    public Curso findById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    // Listar todos
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    // Eliminar por ID
    public void deleteById(Long id) {
        cursoRepository.deleteById(id);
    }

    //parcial
     public ResponseEntity<Curso> updateById(Long id, Curso cursoUpdate){
        try{
            Curso cursoExist = findById(id);
            if(cursoExist == null) return ResponseEntity.notFound().build();

            if (cursoUpdate.getNombre() != null) cursoExist.setNombre(cursoUpdate.getNombre());
            if (cursoUpdate.getNumero_curso() != null) cursoExist.setNombre_curso(cursoUpdate.getNumero_curso);
          

            Curso cursoSave = save(cursoExist);
            return ResponseEntity.ok(cursoSave);
         }catch (Exception e){
            return ResponseEntity.internalServerError().build();
         }
    }

}
