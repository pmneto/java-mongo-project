package com.paulo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        // Inicializa o Spring Boot e levanta o servidor embutido
        SpringApplication.run(Main.class, args);
    }
}
