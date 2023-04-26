package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectosRepository extends JpaRepository<Proyectos, Integer> {
    void deleteProyectoById(Long id);
    Optional<Proyectos> findProyectoById(Long id);
}
