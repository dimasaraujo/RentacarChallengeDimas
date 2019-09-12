package com.vsoft.rentacarchallengedimas.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vaga")
@Data
public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long posicaoVaga;
    private boolean vagaLivre;
    private boolean ativo;
}
