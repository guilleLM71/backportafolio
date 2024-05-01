package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.SkillsSec;
import com.backportafolio.backportafolio.domain.ports.outputs.SkillSecRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SkillSecRepositoryAdapter implements SkillSecRepositoryPort {

    private final SkillSecRepository skillSecRepository;

    public SkillSecRepositoryAdapter(SkillSecRepository skillSecRepository) {
        this.skillSecRepository = skillSecRepository;
    }

    @Override
    public SkillsSec save(SkillsSec skillSec) throws Exception {
        return skillSecRepository.save(skillSec);
    }

    @Override
    public List<SkillsSec> findAll() throws Exception {
        return skillSecRepository.findAll();
    }
}
