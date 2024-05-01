package com.backportafolio.backportafolio.domain.ports.outputs;

import com.backportafolio.backportafolio.domain.models.Proyectos;

import java.util.List;

public interface ProyectosRepositoryPort {
    Proyectos save(Proyectos proyectos) throws Exception;
    List<Proyectos> findAll() throws Exception;
}
