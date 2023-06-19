package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.dto.PersonaDto;
import com.portfolio.SpringBoot.model.Persona;
import com.portfolio.SpringBoot.security.controller.Mensaje;
import com.portfolio.SpringBoot.service.PersonaService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/lista")
    public ResponseEntity<List<Persona>> list() {
        List<Persona> list = personaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody PersonaDto personaDto) {
        if (StringUtils.isBlank(personaDto.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombe es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Persona persona = new Persona(personaDto.getApellido(), personaDto.getNombre(), personaDto.getOcupacion(), personaDto.getSobremi(), personaDto.getUrlImagen());
        personaService.save(persona);
        return new ResponseEntity(new Mensaje("Persona agregada"), HttpStatus.OK);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody PersonaDto personaDto) {
        if (!personaService.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }
        if (StringUtils.isBlank(personaDto.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Persona persona = personaService.getOne(id).get();
        persona.setApellido(personaDto.getApellido());
        persona.setNombre(personaDto.getNombre());
        persona.setOcupacion(personaDto.getOcupacion());
        persona.setSobremi(personaDto.getSobremi());
        persona.setUrl_imagen(personaDto.getUrlImagen());

        personaService.save(persona);
        return new ResponseEntity(new Mensaje("Persona actualizada"), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!personaService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        personaService.delete(id);
        return new ResponseEntity(new Mensaje("Persona eliminado"), HttpStatus.OK);
    }

}
