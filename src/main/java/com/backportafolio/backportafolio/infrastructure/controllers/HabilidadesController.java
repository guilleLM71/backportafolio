package com.backportafolio.backportafolio.infrastructure.controllers;

import com.backportafolio.backportafolio.aplication.services.HabilidadesService;
import com.backportafolio.backportafolio.domain.models.Habilidades;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController()
@RequestMapping("/api/habilidades")
public class HabilidadesController {
    private final HabilidadesService habilidadesService;

    public HabilidadesController(HabilidadesService habilidadesService) {
        this.habilidadesService = habilidadesService;
    }

    @PostMapping()
    public ResponseEntity<Habilidades> registrar(@RequestBody Habilidades habilidades) throws Exception
    {
        if(habilidades!=null)
        {
            habilidadesService.registrarHabilidades(habilidades);
            return new ResponseEntity<>(habilidades, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping()
    public ResponseEntity<List<Habilidades>>obtenerHabilidades() throws Exception
    {
        List<Habilidades>habilidades=habilidadesService.obtenerHabilidades();
        if(habilidades!=null)
        {
            return new ResponseEntity<>(habilidades,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
