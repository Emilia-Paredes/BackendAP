package com.portfolio.SpringBoot.dto;

import javax.validation.constraints.NotBlank;

public class PersonaDto {

    @NotBlank
    private String apellido;
    private String nombre;
    private String ocupacion;
    private String sobremi;
    private String url_imagen;

    public PersonaDto() {
    }

    public PersonaDto(String apellido, String nombre, String ocupacion, String sobremi, String url_imagen) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.sobremi = sobremi;
        this.url_imagen = url_imagen;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getSobremi() {
        return sobremi;
    }

    public void setSobremi(String sobremi) {
        this.sobremi = sobremi;
    }

    public String getUrlImagen() {
        return url_imagen;
    }

    public void setUrlImagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }
}
