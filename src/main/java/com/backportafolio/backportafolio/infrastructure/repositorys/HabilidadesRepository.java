package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.Habilidades;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HabilidadesRepository extends MongoRepository<Habilidades, String> {
}
