package com.daniel.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.entities.Instrutor;


@Repository
public interface InstrutorRepository
        extends JpaRepository<Instrutor, Long> {

         List<Instrutor> findByNomeContaining(String nome);

}