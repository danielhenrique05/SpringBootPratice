package com.daniel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.entities.Aula;

public interface  AulaRespository extends  JpaRepository<Aula, Long> {
  
}
