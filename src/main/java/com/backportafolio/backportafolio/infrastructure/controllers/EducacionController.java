package com.backportafolio.backportafolio.infrastructure.controllers;

import com.backportafolio.backportafolio.aplication.services.EducacionService;
import com.backportafolio.backportafolio.domain.models.Educacion;
import com.backportafolio.backportafolio.domain.models.Perfil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/educacion")
public class EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }

    @PostMapping
    public ResponseEntity<Educacion> registrar(@RequestBody Educacion educacion) throws Exception
    {
        if(educacion!=null)
        {
            educacionService.registrarEducacion(educacion);
            return new ResponseEntity<>(educacion, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping
    public ResponseEntity<List<Educacion>> obtenerEducacion() throws Exception
    {
        List<Educacion> educacion = educacionService.obtenerEducacion();
        if(educacion!=null)
        {
            return new ResponseEntity<>(educacion,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
