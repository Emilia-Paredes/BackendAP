 package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.model.Educacion;
import com.portfolio.SpringBoot.service.EducacionService;
import com.portfolio.SpringBoot.dto.EducacionDto;
import com.portfolio.SpringBoot.security.controller.Mensaje;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = {"https://porfolio-aep.web.app", "http://localhost:4200"})
public class EducacionController {
    
    @Autowired
    private EducacionService educacionService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list() {
        List<Educacion> list = educacionService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody EducacionDto educacionDto) {
        if(StringUtils.isBlank(educacionDto.getNombreEdu())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = new Educacion(
        educacionDto.getInstitucion(), educacionDto.getNombreEdu(), educacionDto.getDuracionEdu(), 
                educacionDto.getDescripcionEdu(), educacionDto.getImageEdu()
        );
        educacionService.save(educacion);
        return new ResponseEntity(new Mensaje("Educacion creada"), HttpStatus.OK);
    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody EducacionDto educacionDto){
        if(!educacionService.existById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        if(StringUtils.isBlank(educacionDto.getNombreEdu()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Educacion educacion = educacionService.getOne(id).get();
        educacion.setNombreEdu(educacionDto.getNombreEdu());
        educacion.setDescripcionEdu(educacionDto.getDescripcionEdu());
        educacion.setDuracionEdu(educacionDto.getDuracionEdu());
        educacion.setInstitucion(educacionDto.getInstitucion());
        educacion.setImageEdu(educacionDto.getImageEdu());
        
        educacionService.save(educacion);
        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if(!educacionService.existById(id)  ) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        educacionService.delete(id);
        return new ResponseEntity(new Mensaje(" Educacion eliminada"), HttpStatus.OK);
    }
    
    
}
