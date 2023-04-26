package com.portfolio.SpringBoot.secutiry.repository;
 
import com.portfolio.SpringBoot.security.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByUsuario(String usuario);
    
    boolean existsByUsuario(String Usuario);
    boolean existsByEmail(String email);
}
