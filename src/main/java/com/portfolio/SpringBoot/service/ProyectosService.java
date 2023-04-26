package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Proyectos;
import com.portfolio.SpringBoot.repository.ProyectosRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ProyectosService {
    
    @Autowired
    public ProyectosRepository proyectosRepo;

    public Proyectos addProyecto(Proyectos proyecto) {
        return proyectosRepo.save(proyecto);
    }

    public List<Proyectos> findAllProyectos() {
        return proyectosRepo.findAll();
    }

    public Proyectos updateProyectos(Proyectos proyecto) {
        return proyectosRepo.save(proyecto);
    }

    public void deleteProyecto(Long id) {
        proyectosRepo.deleteProyectoById(id);
    }


    public Proyectos findProyecto(Long id) {
        return proyectosRepo.findProyectoById(id).orElse(null);
    }
}
