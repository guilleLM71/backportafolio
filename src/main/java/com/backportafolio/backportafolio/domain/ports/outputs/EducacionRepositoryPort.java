package com.backportafolio.backportafolio.domain.ports.outputs;

import com.backportafolio.backportafolio.domain.models.Educacion;

import java.util.List;

public interface EducacionRepositoryPort {
    Educacion save(Educacion educacion) throws Exception;
    List<Educacion> findAll() throws Exception;
}
