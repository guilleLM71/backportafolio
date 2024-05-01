package com.backportafolio.backportafolio.aplication.services;

import com.backportafolio.backportafolio.domain.models.Proyectos;
import com.backportafolio.backportafolio.domain.ports.inputs.ProyectosUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProyectosService implements ProyectosUseCase {

    public final ProyectosUseCase proyectosUseCase;

    public ProyectosService(ProyectosUseCase proyectosUseCase) {
        this.proyectosUseCase = proyectosUseCase;
    }


    @Override
    public Proyectos registrarProyectos(Proyectos proyectos) throws Exception {
        return proyectosUseCase.registrarProyectos(proyectos);
    }

    @Override
    public List<Proyectos> obtenerProyectos() throws Exception {
        return proyectosUseCase.obtenerProyectos();
    }
}
