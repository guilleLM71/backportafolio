package com.backportafolio.backportafolio.infrastructure.controllers;

import com.backportafolio.backportafolio.aplication.services.ProyectosService;
import com.backportafolio.backportafolio.domain.models.Perfil;
import com.backportafolio.backportafolio.domain.models.Proyectos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/proyectos")
public class ProyectosController {

    private final ProyectosService proyectosService;

    public ProyectosController(ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }

    @PostMapping
    public ResponseEntity<Proyectos> registrar(@RequestBody Proyectos proyectos) throws Exception
    {
        if(proyectos!=null)
        {
            proyectosService.registrarProyectos(proyectos);
            return new ResponseEntity<>(proyectos, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping
    public ResponseEntity<List<Proyectos>>obtenerPerfiles() throws Exception
    {
        List<Proyectos>proyectos=proyectosService.obtenerProyectos();
        if(proyectos!=null)
        {
            return new ResponseEntity<>(proyectos,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
