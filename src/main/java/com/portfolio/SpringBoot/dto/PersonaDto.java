package com.portfolio.SpringBoot.dto;

public class PersonaDto {

    private String nombre;
    private String apellido;
    private String ocupacion;
    private String sobremi;
    private String url_imagen;

    public PersonaDto() {
    }

    public PersonaDto(String nombre, String apellido, String ocupacion, String sobremi, String url_imagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.sobremi = sobremi;
        this.url_imagen = url_imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public void setUrlImagen(String urlImagen) {
        this.url_imagen = url_imagen;
    }
}