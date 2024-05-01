package com.backportafolio.backportafolio.aplication.services;

import com.backportafolio.backportafolio.domain.models.SkillsSec;
import com.backportafolio.backportafolio.domain.ports.inputs.SkillSecUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SkillSecService implements SkillSecUseCase {
    private final SkillSecUseCase skillSecUseCase;

    public SkillSecService(SkillSecUseCase skillSecUseCase) {
        this.skillSecUseCase = skillSecUseCase;
    }

    @Override
    public SkillsSec registrarSkillSec(SkillsSec skillSec) throws Exception {
        return skillSecUseCase.registrarSkillSec(skillSec);
    }

    @Override
    public List<SkillsSec> obtenerSkillSec() throws Exception {
        return skillSecUseCase.obtenerSkillSec();
    }
}
