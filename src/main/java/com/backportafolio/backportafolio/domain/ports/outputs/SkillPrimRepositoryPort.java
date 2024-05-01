package com.backportafolio.backportafolio.domain.ports.outputs;

import com.backportafolio.backportafolio.domain.models.SkillPrim;

import java.util.List;

public interface SkillPrimRepositoryPort {
    SkillPrim save(SkillPrim skillPrim) throws Exception;
    List<SkillPrim> findAll() throws Exception;
}
