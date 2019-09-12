package com.vsoft.rentacarchallengedimas.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ticket")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    private Carro carro;

    @OneToOne
    private Vaga vaga;

    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
}
