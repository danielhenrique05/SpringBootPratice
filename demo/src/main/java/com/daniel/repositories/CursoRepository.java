package com.daniel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.entities.Curso;

public interface  CursoRepository extends JpaRepository<Curso, Long> {
  
}
