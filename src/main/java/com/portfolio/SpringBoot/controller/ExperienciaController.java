package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.model.Experiencia;
import com.portfolio.SpringBoot.service.ExperienciaService;
import com.portfolio.SpringBoot.dto.EducacionDto;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    @Autowired
    private ExperienciaService experienciaService;
}
