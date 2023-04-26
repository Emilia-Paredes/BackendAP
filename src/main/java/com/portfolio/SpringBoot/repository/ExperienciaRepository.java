package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer>{
   /* public Optional<Experiencia> findByNombreE(String puesto); 
    public boolean existsByNombreE(String puesto);///
    public Optional<Experiencia> findById(int id);
    public void deleteById(int id);
    public boolean existsById(int id);*/
    
    public Optional<Experiencia> findByNombreExp(String nombreExp);
    public boolean existsByNombreExp(String nombreExp);
    
}
