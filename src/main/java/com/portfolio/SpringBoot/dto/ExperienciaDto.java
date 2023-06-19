package com.portfolio.SpringBoot.dto;

import javax.validation.constraints.NotBlank;

public class ExperienciaDto {
    
    @NotBlank
    private String nombreExp;
   private String duracionExp;
    private String descripcionExp;
     private String imageExp;

    public ExperienciaDto() {
    }
    
    public ExperienciaDto(String nombreExp, String duracionExp, String descripcionExp, String imageExp) {
        this.nombreExp = nombreExp;
        this.duracionExp = duracionExp;
        this.descripcionExp = descripcionExp;
       this.imageExp = imageExp;
    }

    public String getDuracionExp() {
        return duracionExp;
    }

    public void setDuracionExp(String duracionExp) {
        this.duracionExp = duracionExp;
    }

    public String getImageExp() {
        return imageExp;
    }

    public void setImageExp(String imageExp) {
        this.imageExp = imageExp;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }
    
}