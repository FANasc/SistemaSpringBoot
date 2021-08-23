package com.dio.live.model;

/***************************************************************************************************************
 *
 * Objetivo: Classe Jornada de Trabalho
 *
 * Autor   : Fernando Aguiar
 *
 * Data    : 20.08.2021
 *
 ***************************************************************************************************************/

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;
}
