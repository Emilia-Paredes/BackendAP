package com.portfolio.SpringBoot.dto;

import javax.validation.constraints.NotBlank;

public class ProyectosDto {
    
    @NotBlank
    private String nombreProy;
    private String descripcionProy;
    private String imageProy;
    
    public ProyectosDto() {
    }
    
    public ProyectosDto(String nombreProy, String descripcionProy, String imageProy) {
        this.nombreProy = nombreProy;
        this.descripcionProy = descripcionProy;
        this.imageProy = imageProy;
    }

    public String getNombreProy() {
        return nombreProy;
    }

    public void setNombreProy(String nombreProy) {
        this.nombreProy = nombreProy;
    }

    public String getDescripcionProy() {
        return descripcionProy;
    }

    public void setDescripcionProy(String descripcionProy) {
        this.descripcionProy = descripcionProy;
    }

    public String getImageProy() {
        return imageProy;
    }

    public void setImageProy(String imageProy) {
        this.imageProy = imageProy;
    }
}
