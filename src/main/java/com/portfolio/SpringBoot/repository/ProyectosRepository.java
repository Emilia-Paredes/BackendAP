package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Integer> {
    public Optional<Proyectos> findByNombreProy(String nombreProy);
    public boolean existsByNombreProy(String nombreProy);
}
