package com.vsoft.rentacarchallengedimas.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class CarroResource {

    @GetMapping
    public String listarCarros(){
        return "Carro 01, Carro 02, Carro 03";
    }
}
