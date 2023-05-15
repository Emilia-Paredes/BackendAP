package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.model.Persona;
import com.portfolio.SpringBoot.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/*import org.springframework.security.access.prepost.PreAuthorize;*/
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired
    private IPersonaService personaService;
    
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Persona> verPersona(@PathVariable("id") Long id) {
        Persona persona = personaService.buscarPersona(id);
        return new ResponseEntity(persona, HttpStatus.OK);
    }
    
    @GetMapping("/lista")
    public  ResponseEntity<List<Persona>> verPersonas() {
        List<Persona> personas = personaService.verPersonas();
        return new ResponseEntity(personas, HttpStatus.OK);
    }
    
   /* @PreAuthorize("hasRole('ADMIN')")*/
    @PostMapping("/crear") 
        public String agregarPersona(@RequestBody Persona persona) {
            personaService.crearPersona(persona);
            return "La persona fue creada correctamente.";
    }
        
    /*@PreAuthorize("hasRole('ADMIN')")*/
    @DeleteMapping("/eliminar/{id}")
    public String deletePersona(@PathVariable Long id) {
        personaService.borrarPersona(id);
        return "La persona fue eliminada correctamente.";
    }
    
    /*@PreAuthorize("hasRole('ADMIN')")*/
    @PutMapping("/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                                               @RequestParam("nombre") String nuevoNombre,                                                               
                                                               @RequestParam("apellido") String nuevoApellido,                                                               
                                                               @RequestParam("ocupacion") String nuevoOcupacion,
                                                               @RequestParam("sobremi") String nuevoSobremi,
                                                               @RequestParam("url_imagen") String nuevoImg) {
           Persona persona = personaService.buscarPersona(id);
           
           persona.setNombre(nuevoNombre);
           persona.setApellido(nuevoApellido);
           persona.setOcupacion(nuevoOcupacion);      
           persona.setSobremi(nuevoSobremi);
           persona.setUrl_imagen(nuevoImg);
           
           personaService.crearPersona(persona);
           return persona;
    }


    
}