package com.dio.live.repository;

/***************************************************************************************************************
 *
 * Objetivo: Camada Repository.
 *
 * Autor   : Fernando Aguiar
 *
 * Data    : 23.08.2021
 *
 ***************************************************************************************************************/

import com.dio.live.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
