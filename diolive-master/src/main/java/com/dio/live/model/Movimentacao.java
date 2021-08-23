package com.dio.live.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/***************************************************************************************************************
 *
 * Objetivo: Classe Movimentacao
 *
 * Autor   : Fernando Aguiar
 *
 * Data    : 20.08.2021
 *
 ***************************************************************************************************************/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentacao {

        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable // Anotar a classe que compõe, neste caso, chave composta.
        public  class  MovimentacaoId implements Serializable{ // Esta implementação serve para transformar
                                                               // a classe em uma sequência de bytes para
                                                               // enviar objetos pela rede.
            private long idMovimento;
            private long idUsuario;
        }
        @Id
        @EmbeddedId
        private MovimentacaoId movimentacaoId; // Foi criada uma abstração nesta classe que
                                               // não existe na tabela
        private LocalDateTime dataEntrada;
        private LocalDateTime dataSaida;
        private BigDecimal periodo;
        @ManyToOne
        private Ocorrencia ocorrencia;
        @ManyToOne
        private Calendario calendario;
}
