    package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.dto.ProyectosDto;
import com.portfolio.SpringBoot.model.Proyectos;
import com.portfolio.SpringBoot.security.controller.Mensaje;
import com.portfolio.SpringBoot.service.ProyectosService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proyectos")
@CrossOrigin(origins = "http://localhost:4200")

public class ProyectosController {
     @Autowired
    ProyectosService proyectosService;

    @GetMapping("/lista")
    public ResponseEntity<List<Proyectos>> list() {
        List<Proyectos> proyectos = proyectosService.list();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<?> addProyecto (@RequestBody ProyectosDto proyectoDto) {
        if(StringUtils.isBlank(proyectoDto.getNombreProy())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Proyectos proyecto = new Proyectos(
        proyectoDto.getNombreProy(), proyectoDto.getDescripcionProy(), proyectoDto.getImageProy());
        proyectosService.save(proyecto);
        return new ResponseEntity(new Mensaje("Proyecto creada"), HttpStatus.OK);
    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> updateProyectos (@PathVariable("id") int id, @RequestBody ProyectosDto proyectoDto) {
        if(!proyectosService.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }
        if(StringUtils.isBlank(proyectoDto.getNombreProy())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Proyectos proyecto = proyectosService.getOne(id).get();
        proyecto.setNombreProy(proyectoDto.getNombreProy());
        proyecto.setDescripcionProy(proyectoDto.getDescripcionProy());
        proyecto.setImageProy(proyectoDto.getImageProy());
        
        proyectosService.save(proyecto);
        return new ResponseEntity(new Mensaje("Proyecto actualizado"), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> deleteProyecto (@PathVariable("id") int id) {
        if(!proyectosService.existsById(id)  ) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        proyectosService.delete(id);
        return new ResponseEntity<>(new Mensaje(" Proyecto eliminada"), HttpStatus.OK);
    }
}
