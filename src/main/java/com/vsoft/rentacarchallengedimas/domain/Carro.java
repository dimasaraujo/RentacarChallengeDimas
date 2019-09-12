package com.vsoft.rentacarchallengedimas.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "carro")
@Data
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_carro")
    private Long id;
    @Column(name = "nm_carro")
    private String nome;
    @Column(name = "ds_placa")
    private String placa;
    @Column(name = "fl_ativo")
    private boolean ativo;


}
