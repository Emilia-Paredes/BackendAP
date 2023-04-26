package com.portfolio.SpringBoot.security.service;

import com.portfolio.SpringBoot.security.model.Usuario;
import com.portfolio.SpringBoot.secutiry.repository.UsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public Optional<Usuario> getByUsuario(String usuario) {
            return usuarioRepository.findByUsuario(usuario);
    }
    
    public boolean existsByUsuario(String usuario) {
        return usuarioRepository.existsByUsuario(usuario);
    }
    
    public boolean existsByEmail(String email) {
        return usuarioRepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
