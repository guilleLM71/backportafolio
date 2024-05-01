package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.Proyectos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProyectosRepository extends MongoRepository<Proyectos, String>{
}
