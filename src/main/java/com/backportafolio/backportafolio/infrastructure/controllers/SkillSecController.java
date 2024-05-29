package com.backportafolio.backportafolio.infrastructure.controllers;

import com.backportafolio.backportafolio.aplication.services.SkillSecService;
import com.backportafolio.backportafolio.domain.models.SkillsSec;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/skillsec")
public class SkillSecController {
    private final SkillSecService skillSecService;

    public SkillSecController(SkillSecService skillSecService) {
        this.skillSecService = skillSecService;
    }

    @PostMapping
    public ResponseEntity<SkillsSec> registrar(@RequestBody SkillsSec skillSec) throws Exception
    {
        if(skillSec!=null)
        {
            skillSecService.registrarSkillSec(skillSec);
            return new ResponseEntity<>(skillSec, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping
    public ResponseEntity<List<SkillsSec>> obtenerSkillSec() throws Exception
    {
        List<SkillsSec> skillSec = skillSecService.obtenerSkillSec();
        if(skillSec!=null)
        {
            return new ResponseEntity<>(skillSec,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
