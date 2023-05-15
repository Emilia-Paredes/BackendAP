package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.model.Experiencia;
import com.portfolio.SpringBoot.service.ExperienciaService;
import com.portfolio.SpringBoot.dto.ExperienciaDto;
import com.portfolio.SpringBoot.security.controller.Mensaje;
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
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list() {
        List<Experiencia> list = experienciaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody ExperienciaDto expDto) {
        if (StringUtils.isBlank(expDto.getNombreExp())) 
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
              
        Experiencia experiencia = new Experiencia(expDto.getNombreExp(), expDto.getDescripcionExp(), expDto.getDuracionExp(), expDto.getImageExp());
        experienciaService.save(experiencia);
        
        return new ResponseEntity(new Mensaje("Experiencia cargada"), HttpStatus.OK);
    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> update (@PathVariable("id") int id, @RequestBody ExperienciaDto expDto) {
        if(!experienciaService.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        if(experienciaService.existsByNombreExp(expDto.getNombreExp()) && experienciaService.getByNombreExp(expDto.getNombreExp()).get().getId() != id)
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = experienciaService.getOne(id).get();
        experiencia.setNombreExp(expDto.getNombreExp());
        experiencia.setDuracionExp(expDto.getDuracionExp());
        experiencia.setDescripcionExp(expDto.getDescripcionExp());
        experiencia.setImageExp(expDto.getImageExp());
        
        experienciaService.save(experiencia);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if(!experienciaService.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        experienciaService.delete(id);
        
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }
    
}
