package com.backportafolio.backportafolio.infrastructure.controllers;

import com.backportafolio.backportafolio.aplication.services.SkillPrimService;
import com.backportafolio.backportafolio.domain.models.Perfil;
import com.backportafolio.backportafolio.domain.models.SkillPrim;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skillprim")
public class SkillPrimController {
    private final SkillPrimService skillPrimService;

    public SkillPrimController(SkillPrimService skillPrimService) {
        this.skillPrimService = skillPrimService;
    }
    @PostMapping
    public ResponseEntity<SkillPrim> registrar(@RequestBody SkillPrim skillPrim) throws Exception
    {
        if(skillPrim!=null)
        {
            skillPrimService.registrarSkillPrim(skillPrim);
            return new ResponseEntity<>(skillPrim, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping
    public ResponseEntity<List<SkillPrim>> obtenerSkillPrim() throws Exception
    {
        List<SkillPrim> skillPrim = skillPrimService.obtenerSkillPrim();
        if(skillPrim!=null)
        {
            return new ResponseEntity<>(skillPrim,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
