package com.backportafolio.backportafolio.domain.ports.inputs;

import com.backportafolio.backportafolio.domain.models.Proyectos;

import java.util.List;

public interface ProyectosUseCase {
    Proyectos registrarProyectos(Proyectos proyectos) throws Exception;
    List<Proyectos> obtenerProyectos() throws Exception;
}
