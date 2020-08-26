package com.matiasiturbide.medicinecabinet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MedicinecabinetApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicinecabinetApplication.class, args);
    }

}
