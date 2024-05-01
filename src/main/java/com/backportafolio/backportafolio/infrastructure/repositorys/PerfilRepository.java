package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.Perfil;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PerfilRepository extends MongoRepository<Perfil, String> {
}
