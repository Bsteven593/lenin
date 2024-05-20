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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.leninjahir.entities.Jornada;
import com.example.leninjahir.service.JornadaService;

@RestController
@RequestMapping("/api/v1")
public class JornadaContreoller {
        @Autowired
    private JornadaService jornadaService;

    @PostMapping(value ="/jornada")
    public Jornada findById(@RequestBody Jornada entity){
        return jornadaService.save(entity);
    }

     @GetMapping(value ="/jornada/{id}")
    public Jornada findById(@PathVariable("id") Long id) {
        return jornadaService.findById(id);
    }
    @GetMapping(value ="/jornada")
    public List<Jornada> findAll(){
        return jornadaService.findAll();
    }


     @PutMapping(value ="/jornada")
    public Jornada update(@RequestBody Jornada entity){
        return jornadaService.save(entity);
    }

    @PatchMapping(value = "/jornada/{id}")
    public ResponseEntity<Jornada>  updateById(@PathVariable("id") Long id, @RequestBody Jornada jornada){
        return  jornadaService.updateById(id, jornada);
    }

     @DeleteMapping(value ="/jornada/{id}")
    public void delete(@PathVariable("id") Long id){
    jornadaService.deleteById(id);


     }
    
}
