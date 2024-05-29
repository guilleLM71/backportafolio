package com.backportafolio.backportafolio.infrastructure.controllers;

import com.backportafolio.backportafolio.aplication.services.ExperienciaService;
import com.backportafolio.backportafolio.domain.models.Experiencia;
import com.backportafolio.backportafolio.domain.models.Perfil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/experiencia")
public class ExperienciaController {
    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @PostMapping
    public ResponseEntity<Experiencia> registrar(@RequestBody Experiencia experiencia) throws Exception
    {
        if(experiencia!=null)
        {
            experienciaService.registrarExperiencia(experiencia);
            return new ResponseEntity<>(experiencia, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping
    public ResponseEntity<List<Experiencia>> obtenerExperiencia() throws Exception
    {
        List<Experiencia> experiencias = experienciaService.obtenerExperiencia();
        if(experiencias!=null)
        {
            return new ResponseEntity<>(experiencias,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
