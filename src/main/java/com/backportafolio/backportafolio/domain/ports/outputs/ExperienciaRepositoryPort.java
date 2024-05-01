package com.backportafolio.backportafolio.domain.ports.outputs;

import com.backportafolio.backportafolio.domain.models.Experiencia;

import java.util.List;

public interface ExperienciaRepositoryPort {
    Experiencia save(Experiencia experiencia) throws Exception;
    List<Experiencia> findAll() throws Exception;
}
