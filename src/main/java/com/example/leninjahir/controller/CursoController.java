package com.example.leninjahir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.leninjahir.entities.Curso;
import com.example.leninjahir.service.CursoService;


public class CursoController {
        @Autowired
    private CursoService cursoService;

    @PostMapping(value ="/curso")
    public Curso findById(@RequestBody Curso entity){
        return cursoService.save(entity);
    }

     @GetMapping(value ="/curso/{id}")
    public Curso findById(@PathVariable("id") Long id) {
        return cursoService.findById(id);
    }
    @GetMapping(value ="/curso")
    public List<Curso> findAll(){
        return cursoService.findAll();
    }


     @PutMapping(value ="/curso")
    public Curso update(@RequestBody Curso entity){
        return cursoService.save(entity);
    }

    @PatchMapping(value = "/curso/{id}")
    public ResponseEntity<Curso>  updateById(@PathVariable("id") Long id, @RequestBody Curso curso){
        return  cursoService.updateById(id, curso);
    }

     @DeleteMapping(value ="/curso/{id}")
    public void delete(@PathVariable("id") Long id){
    cursoService.deleteById(id);


     }
    
}
