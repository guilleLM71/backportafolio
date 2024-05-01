package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.Educacion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EducacionRepository extends MongoRepository<Educacion, String> {
}
