package com.portfolio.SpringBoot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
     @Size( min=1, max=25, message="Nocumple con la longitud" )
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String email;
    private String sobremi;
    private String url_imagen;

    //Constructores
    public Persona() {
    }

    public Persona(String nombre, String apellido, String ocupacion, String email, String sobremi, String url_imagen) {
        //this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.email = email;
        this.sobremi = sobremi;
        this.url_imagen = url_imagen;
    }
    
}
