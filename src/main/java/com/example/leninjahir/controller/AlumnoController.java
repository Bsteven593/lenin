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

import com.example.leninjahir.entities.Alumno;
import com.example.leninjahir.service.AlumnoService;

@RestController
@RequestMapping("/api/v1")
public class AlumnoController {
 
    @Autowired
    private AlumnoService alumnoService;

    @PostMapping(value ="/alumno")
    public Alumno findById(@RequestBody Alumno entity){
        return alumnoService.save(entity);
    }

     @GetMapping(value ="/alumno/{id}")
    public Alumno findById(@PathVariable("id") Long id) {
        return alumnoService.findById(id);
    }
    @GetMapping(value ="/alumno")
    public List<Alumno> findAll(){
        return alumnoService.findAll();
    }


     @PutMapping(value ="/alumno")
    public Alumno update(@RequestBody Alumno entity){
        return alumnoService.save(entity);
    }

    @PatchMapping(value = "/alumno/{id}")
    public ResponseEntity<Alumno>  updateById(@PathVariable("id") Long id, @RequestBody Alumno alumno){
        return  alumnoService.updateById(id, alumno);
    }

     @DeleteMapping(value ="/patrols/{id}")
    public void delete(@PathVariable("id") Long id){
    alumnoService.deleteById(id);


     }
    
}
