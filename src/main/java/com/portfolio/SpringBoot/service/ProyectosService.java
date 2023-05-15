package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Proyectos;
import com.portfolio.SpringBoot.repository.ProyectosRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ProyectosService {
    
    @Autowired
    public ProyectosRepository proyectosRepo;

    public List<Proyectos> list() {
        return proyectosRepo.findAll();
    }
        
    public Optional<Proyectos> getOne(int id) {
        return proyectosRepo.findById(id);
    }
    
    public Optional<Proyectos> getByProy(String nombreProy) {
        return proyectosRepo.findByNombreProy(nombreProy);
    }
    
    public void save(Proyectos proyecto) {
        proyectosRepo.save(proyecto);
    }

    public void delete(int id) {
        proyectosRepo.deleteById(id);
    }
        
    public boolean existsById(int id){
        return proyectosRepo.existsById(id);
    }

    public boolean existsByProyecto(String nombreProy) {
        return proyectosRepo.existsByNombreProy(nombreProy);
    }

}
