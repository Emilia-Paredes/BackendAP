package com.portfolio.SpringBoot.dto;

import javax.validation.constraints.NotBlank;

public class ExperienciaDto {
    
    @NotBlank
    private String nombreExp;
    @NotBlank
    private String descripcionExp;

    public ExperienciaDto() {
    }
    
    public ExperienciaDto(String nombreExp, String descripcionExp) {
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreEdu) {
        this.nombreExp = nombreExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }
    
}