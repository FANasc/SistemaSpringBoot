package com.dio.live.model;

/***************************************************************************************************************
 *
 * Objetivo: Classe Banco de Horas
 *
 * Autor   : Fernando Aguiar
 *
 * Data    : 20.08.2021
 *
 ***************************************************************************************************************/

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {
    @EqualsAndHashCode
    @Embeddable // Anotar a classe que compõe, neste caso, chave composta.
    @Getter
    @Setter
    public  class BancoHorasId implements Serializable{ // Esta implementação serve para transformar
                                                        // a classe em uma sequência de bytes para
                                                        // enviar objetos pela rede.
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;
    }
    @EmbeddedId
    private BancoHorasId bancoHorasId; // Foi criada uma abstração nesta classe que
                                       // não existe na tabela
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}