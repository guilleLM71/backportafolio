package com.backportafolio.backportafolio.aplication.usecases;

import com.backportafolio.backportafolio.domain.models.Experiencia;
import com.backportafolio.backportafolio.domain.ports.inputs.ExperienciaUseCase;
import com.backportafolio.backportafolio.domain.ports.outputs.ExperienciaRepositoryPort;

import java.util.List;

public class ExperienciaUseCaseImpl implements ExperienciaUseCase {
    private final ExperienciaRepositoryPort experienciaRepositoryPort;

    public ExperienciaUseCaseImpl(ExperienciaRepositoryPort experienciaRepositoryPort) {
        this.experienciaRepositoryPort = experienciaRepositoryPort;
    }

    @Override
    public Experiencia registrarExperiencia(Experiencia experiencia) throws Exception {
        return experienciaRepositoryPort.save(experiencia);
    }

    @Override
    public List<Experiencia> obtenerExperiencia() throws Exception {
        return experienciaRepositoryPort.findAll();
    }
}
