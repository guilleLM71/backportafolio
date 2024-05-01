package com.backportafolio.backportafolio.domain.ports.outputs;

import com.backportafolio.backportafolio.domain.models.Habilidades;

import java.util.List;

public interface HabilidadesRepositoryPort {
    Habilidades save(Habilidades habilidades) throws Exception;
    List<Habilidades> findAll() throws Exception;
}
