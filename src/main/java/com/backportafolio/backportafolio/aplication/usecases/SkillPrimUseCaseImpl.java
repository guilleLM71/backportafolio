package com.backportafolio.backportafolio.aplication.usecases;

import com.backportafolio.backportafolio.domain.models.SkillPrim;
import com.backportafolio.backportafolio.domain.ports.inputs.SkillPrimUseCase;
import com.backportafolio.backportafolio.domain.ports.outputs.SkillPrimRepositoryPort;

import java.util.List;

public class SkillPrimUseCaseImpl implements SkillPrimUseCase {

    private final SkillPrimRepositoryPort skillPrimRepositoryPort;

    public SkillPrimUseCaseImpl(SkillPrimRepositoryPort skillPrimRepositoryPort) {
        this.skillPrimRepositoryPort = skillPrimRepositoryPort;
    }

    @Override
    public SkillPrim registrarSkillPrim(SkillPrim skillPrim) throws Exception {
        return skillPrimRepositoryPort.save(skillPrim);
    }

    @Override
    public List<SkillPrim> obtenerSkillPrim() throws Exception {
        return skillPrimRepositoryPort.findAll();
    }
}
