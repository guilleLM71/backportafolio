package com.backportafolio.backportafolio.infrastructure.controllers;

import com.backportafolio.backportafolio.aplication.services.PerfilService;
import com.backportafolio.backportafolio.domain.models.Perfil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController()
@RequestMapping("/api/perfil")
public class PerfilController {
    private final PerfilService perfilService;

    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @PostMapping()
    public ResponseEntity<Perfil> registrar(@RequestBody Perfil perfil) throws Exception
    {
        if(perfil!=null)
        {
            perfilService.registrarPerfil(perfil);
            return new ResponseEntity<>(perfil, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //Get all the registered users.
    @GetMapping()
    public ResponseEntity<List<Perfil>>obtenerPerfiles() throws Exception
    {
        List<Perfil>perfiles=perfilService.obtenerPerfil();
        if(perfiles!=null)
        {
            return new ResponseEntity<>(perfiles,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
