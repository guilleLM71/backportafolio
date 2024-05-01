package com.backportafolio.backportafolio.aplication.usecases;

import com.backportafolio.backportafolio.domain.models.Proyectos;
import com.backportafolio.backportafolio.domain.ports.inputs.ProyectosUseCase;
import com.backportafolio.backportafolio.domain.ports.outputs.ProyectosRepositoryPort;

import java.util.List;

public class ProyectosUseCaseImpl implements ProyectosUseCase {

    private final ProyectosRepositoryPort proyectosRepositoryPort;

    public ProyectosUseCaseImpl(ProyectosRepositoryPort proyectosRepositoryPort) {
        this.proyectosRepositoryPort = proyectosRepositoryPort;
    }

    @Override
    public Proyectos registrarProyectos(Proyectos proyectos) throws Exception {
        return proyectosRepositoryPort.save(proyectos);
    }

    @Override
    public List<Proyectos> obtenerProyectos() throws Exception {
        return proyectosRepositoryPort.findAll();
    }
}
