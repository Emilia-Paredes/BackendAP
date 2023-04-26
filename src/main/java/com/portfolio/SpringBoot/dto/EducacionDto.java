package com.portfolio.SpringBoot.dto;

import javax.validation.constraints.NotBlank;

public class EducacionDto {
    
    @NotBlank
    private String institucion;
    private String nombreEdu;
    private String duracionEdu;
    private String descripcionEdu;
    private String imageEdu;

    public EducacionDto() {
    }
    
    public EducacionDto(String institucion, String nombreEdu, String duracionEdu, String descripcionEdu, String imageEdu) {
        this.institucion = institucion;
        this.nombreEdu = nombreEdu;
        this.duracionEdu = duracionEdu;
        this.descripcionEdu = descripcionEdu;
        this.imageEdu = imageEdu;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getDuracionEdu() {
        return duracionEdu;
    }

    public void setDuracionEdu(String duracionEdu) {
        this.duracionEdu = duracionEdu;
    }

    public String getImageEdu() {
        return imageEdu;
    }

    public void setImageEdu(String imageEdu) {
        this.imageEdu = imageEdu;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }
    
}
