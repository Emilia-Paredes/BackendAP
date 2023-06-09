package com.portfolio.SpringBoot.security.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginUsuario {
    @NotBlank    
    private String usuario;
    @NotBlank
    private String password;
}
