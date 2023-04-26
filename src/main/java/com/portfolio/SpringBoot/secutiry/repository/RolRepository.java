package com.portfolio.SpringBoot.secutiry.repository;

import com.portfolio.SpringBoot.security.model.Rol;
import com.portfolio.SpringBoot.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}