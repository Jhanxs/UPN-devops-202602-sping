package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hans-castro")
public class SaludoController {

    // Endpoint básico: Se accede entrando a http://localhost:8080/api/saludo
    @GetMapping("/saludo")
    public String enviarSaludo() {
        return "¡Hola! Endpoint funcional.";
    }

    // Endpoint con parámetro: Se accede entrando a http://localhost:8080/api/saludo-personalizado?nombre=Hans
    @GetMapping("/saludo-personalizado")
    public String saludoPersonalizado(@RequestParam(defaultValue = "Usuario") String nombre) {
        return "¡Hola, " + nombre + "! Bienvenido a la aplicación.";
    }
}