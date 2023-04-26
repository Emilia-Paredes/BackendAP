package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Educacion;
import com.portfolio.SpringBoot.repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    @Autowired
    public EducacionRepository educacionRepo;
    
    public List<Educacion> list() {
        return educacionRepo.findAll();
    }
    
    public Optional<Educacion> getOne(int id) {
        return educacionRepo.findById(id);
    }
    
    public Optional<Educacion> getByNombreEdu(String nombreEdu) {
        return educacionRepo.findByNombreEdu(nombreEdu);
    }
    
    public void save(Educacion educacion) {
        educacionRepo.save(educacion);
    }
    
    public void delete(int id) {
        educacionRepo.deleteById(id);
    }
    
    public boolean existById(int id) {
        return educacionRepo.existsById(id);
    }
    
    public boolean existsByNombreEdu(String nombreEdu) {
        return educacionRepo.existsByNombreEdu(nombreEdu);
    }
}
