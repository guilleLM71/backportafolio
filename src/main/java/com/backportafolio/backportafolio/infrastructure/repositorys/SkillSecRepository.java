package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.SkillsSec;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillSecRepository extends MongoRepository<SkillsSec, String> {
}
