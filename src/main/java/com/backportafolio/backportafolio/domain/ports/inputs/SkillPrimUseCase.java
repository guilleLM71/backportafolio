package com.backportafolio.backportafolio.domain.ports.inputs;

import com.backportafolio.backportafolio.domain.models.SkillPrim;

import java.util.List;

public interface SkillPrimUseCase {
    SkillPrim registrarSkillPrim(SkillPrim skillPrim) throws Exception;
    List<SkillPrim> obtenerSkillPrim() throws Exception;
}
