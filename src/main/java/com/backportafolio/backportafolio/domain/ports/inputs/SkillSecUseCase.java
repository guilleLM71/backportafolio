package com.backportafolio.backportafolio.domain.ports.inputs;

import com.backportafolio.backportafolio.domain.models.SkillsSec;

import java.util.List;

public interface SkillSecUseCase {
    SkillsSec registrarSkillSec(SkillsSec skillSec) throws Exception;
    List<SkillsSec> obtenerSkillSec() throws Exception;
}
