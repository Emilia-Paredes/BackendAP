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
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String apellido;
    private String nombre;
    private String ocupacion;
    private String sobremi;
    private String url_imagen;

    //Constructores
    public Persona() {
    }

    public Persona(String apellido, String nombre, String ocupacion, String sobremi, String url_imagen) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.sobremi = sobremi;
        this.url_imagen = url_imagen;
    }
    
}
