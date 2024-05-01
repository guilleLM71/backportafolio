package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.SkillPrim;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillPrimRepository extends MongoRepository<SkillPrim, String> {
}
