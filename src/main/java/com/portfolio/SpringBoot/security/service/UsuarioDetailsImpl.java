package com.portfolio.SpringBoot.security.service;

import com.portfolio.SpringBoot.security.model.Usuario;
import com.portfolio.SpringBoot.security.model.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioDetailsImpl implements UserDetailsService {

    @Autowired
    UsuarioService usuarioService;
    
    @Override
    public UserDetails loadUserByUsername(String nombreusuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByUsuario(nombreusuario).get();
        return UsuarioPrincipal.build(usuario);
    }
    
}
