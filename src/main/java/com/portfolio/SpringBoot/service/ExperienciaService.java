package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Experiencia;
import com.portfolio.SpringBoot.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
    
    @Autowired
    public ExperienciaRepository experienciaRepo;
    
    public List<Experiencia> list() {
        return experienciaRepo.findAll();
    }
    
    public Optional<Experiencia> getOne(int id) {
        return experienciaRepo.findById(id);
    }
    
    public Optional<Experiencia> getByNombreExp(String puesto) {
        return experienciaRepo.findByNombreExp(puesto);
    }
    
    public void save(Experiencia expe) {
        experienciaRepo.save(expe);
    }
    
    public void delete( int id) {
        experienciaRepo.deleteById(id);
    }
    
    public boolean existsById(int id) {
        return experienciaRepo.existsById(id);
    }

}
