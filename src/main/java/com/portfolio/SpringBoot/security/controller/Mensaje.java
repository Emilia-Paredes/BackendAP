package com.portfolio.SpringBoot.security.controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Mensaje {
    private String mensaje;
    
    // Constructor

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }  
}
