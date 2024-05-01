package com.backportafolio.backportafolio.domain.ports.outputs;

import com.backportafolio.backportafolio.domain.models.SkillsSec;

import java.util.List;

public interface SkillSecRepositoryPort {
    SkillsSec save(SkillsSec skillSec) throws Exception;
    List<SkillsSec> findAll() throws Exception;

}
