package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersonas();
    
    public Persona crearPersona (Persona persona);
    
    public Persona buscarPersona (Long id);

    public void borrarPersona (Long id);
    
}

