package com.example.leninjahir.repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.leninjahir.entities.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {
    List<Curso> findAll();
}

    

