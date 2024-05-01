package com.backportafolio.backportafolio.aplication.services;

import com.backportafolio.backportafolio.domain.models.SkillPrim;
import com.backportafolio.backportafolio.domain.ports.inputs.SkillPrimUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SkillPrimService implements SkillPrimUseCase {
    public final SkillPrimUseCase skillPrimUseCase;

    public SkillPrimService(SkillPrimUseCase skillPrimUseCase) {
        this.skillPrimUseCase = skillPrimUseCase;
    }

    @Override
    public SkillPrim registrarSkillPrim(SkillPrim skillPrim) throws Exception {
        return skillPrimUseCase.registrarSkillPrim(skillPrim);
    }

    @Override
    public List<SkillPrim> obtenerSkillPrim() throws Exception {
        return skillPrimUseCase.obtenerSkillPrim();
    }
}
