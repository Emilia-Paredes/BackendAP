package com.portfolio.SpringBoot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity  

public class Experiencia implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; 
    private String puesto;
    private String nombreExp;
    private String duracionExp;
    private String descripcionExp;
    private String imageExp;
  	
    //Constructores
    public Experiencia() {
    }

    public Experiencia(String puesto, String nombreExp, String duracionExp, String descripcionExp, String imageExp) {
        this.puesto = puesto;
        this.nombreExp = nombreExp;
        this.duracionExp = duracionExp;
        this.descripcionExp = descripcionExp;
        this.imageExp = imageExp;
    }
}
