package com.backportafolio.backportafolio.aplication.usecases;

import com.backportafolio.backportafolio.domain.models.Habilidades;
import com.backportafolio.backportafolio.domain.ports.inputs.HabilidadesUseCase;
import com.backportafolio.backportafolio.domain.ports.outputs.HabilidadesRepositoryPort;

import java.util.List;

public class HabilidadesUseCaseImpl implements HabilidadesUseCase {

    private final HabilidadesRepositoryPort habilidadesRepositoryPort;

    public HabilidadesUseCaseImpl(HabilidadesRepositoryPort habilidadesRepositoryPort) {
        this.habilidadesRepositoryPort = habilidadesRepositoryPort;
    }

    @Override
    public Habilidades registrarHabilidades(Habilidades habilidades) throws Exception {
        return habilidadesRepositoryPort.save(habilidades);
    }

    @Override
    public List<Habilidades> obtenerHabilidades() throws Exception {
        return habilidadesRepositoryPort.findAll();
    }
}
