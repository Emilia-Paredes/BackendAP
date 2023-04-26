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
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String institucion;
    private String nombreEdu;
    private String duracionEdu;
    private String descripcionEdu;
    private String imageEdu;

    //Constructores
    public Educacion() {
    }
    
    public Educacion(String institucion, String nombreEdu, String duracionEdu, String descripcionEdu, String imageEdu) {
        this.institucion = institucion;
        this.nombreEdu = nombreEdu;
        this.duracionEdu = duracionEdu;
        this.descripcionEdu = descripcionEdu;
        this.imageEdu = imageEdu;
    }
    
    
}
