package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Persona;
import com.portfolio.SpringBoot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository personaRepo;
    
    @Override
    public List<Persona> verPersonas() {
        return personaRepo.findAll();
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepo.save(persona);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return personaRepo.findById(id).orElse(null);
        /*return personaRepo.findById(id).orElseThrow(() -> UserNotFoundException("Persona no encontrada"));*/

    }

    @Override
    public void borrarPersona(Long id) {
        personaRepo.deleteById(id);
    }

    private Persona UserNotFoundException(String persona_no_encontrada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
