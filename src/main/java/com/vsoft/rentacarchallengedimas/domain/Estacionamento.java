package com.vsoft.rentacarchallengedimas.domain;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estacionamento")
@Data
public class Estacionamento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private int numeroVagas;
    @OneToMany
    private List<Vaga> vagas;
    private boolean ativo;

}
