package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Persona;
import com.portfolio.SpringBoot.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService {

    @Autowired
    public PersonaRepository personaRepo;
    
    public List<Persona> list() {
        return personaRepo.findAll();
    }
    
    public Optional<Persona> getOne(int id){
        return personaRepo.findById(id);
    }
    
    public Optional<Persona> getByNombre(String nombre){
        return personaRepo.findByNombre(nombre);
    }
    
    public void save(Persona persona){
        personaRepo.save(persona);
    }
    
    public void delete(int id){
        personaRepo.deleteById(id);
    }
    
    public boolean existsById(int id){
        return personaRepo.existsById(id);
    }
   
    public boolean existsByNombre(String nombre) {
        return personaRepo.existsByNombre(nombre);
    }
}
