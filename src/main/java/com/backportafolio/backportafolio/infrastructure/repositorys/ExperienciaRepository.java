package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.Experiencia;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExperienciaRepository extends MongoRepository<Experiencia, String> {
}
