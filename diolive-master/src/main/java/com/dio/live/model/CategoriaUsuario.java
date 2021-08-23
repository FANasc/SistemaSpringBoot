package com.dio.live.model;

/***************************************************************************************************************
 *
 * Objetivo: Classe Categoria de Usuario
 *
 * Autor   : Fernando Aguiar
 *
 * Data    : 20.08.2021
 *
 ***************************************************************************************************************/

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class CategoriaUsuario {
    @Id
    private long id;
    private String desscricao;
}
