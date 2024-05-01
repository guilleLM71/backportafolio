package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.SkillPrim;
import com.backportafolio.backportafolio.domain.ports.outputs.SkillPrimRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SkillPrimRepositoryAdapter implements SkillPrimRepositoryPort {

    private final SkillPrimRepository skillPrimRepository;

    public SkillPrimRepositoryAdapter(SkillPrimRepository skillPrimRepository) {
        this.skillPrimRepository = skillPrimRepository;
    }

    @Override
    public SkillPrim save(SkillPrim skillPrim) throws Exception {
        return skillPrimRepository.save(skillPrim);
    }

    @Override
    public List<SkillPrim> findAll() throws Exception {
        return skillPrimRepository.findAll();
    }
}
