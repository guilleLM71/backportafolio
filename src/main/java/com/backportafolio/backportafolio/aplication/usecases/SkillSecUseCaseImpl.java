package com.backportafolio.backportafolio.aplication.usecases;

import com.backportafolio.backportafolio.domain.models.SkillsSec;
import com.backportafolio.backportafolio.domain.ports.inputs.SkillSecUseCase;
import com.backportafolio.backportafolio.domain.ports.outputs.SkillSecRepositoryPort;

import java.util.List;

public class SkillSecUseCaseImpl implements SkillSecUseCase {

    private final SkillSecRepositoryPort skillSecRepositoryPort;

    public SkillSecUseCaseImpl(SkillSecRepositoryPort skillSecRepositoryPort) {
        this.skillSecRepositoryPort = skillSecRepositoryPort;
    }

    @Override
    public SkillsSec registrarSkillSec(SkillsSec skillSec) throws Exception {
        return skillSecRepositoryPort.save(skillSec);
    }

    @Override
    public List<SkillsSec> obtenerSkillSec() throws Exception {
        return skillSecRepositoryPort.findAll();
    }
}
