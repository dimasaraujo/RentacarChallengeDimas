package com.vsoft.rentacarchallengedimas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RentacarChallengeDimasApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentacarChallengeDimasApplication.class, args);
    }

}
