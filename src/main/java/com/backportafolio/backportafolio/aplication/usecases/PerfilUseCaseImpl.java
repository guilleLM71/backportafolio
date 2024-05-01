package com.backportafolio.backportafolio.aplication.usecases;

import com.backportafolio.backportafolio.domain.models.Perfil;
import com.backportafolio.backportafolio.domain.ports.inputs.PerfilUseCase;
import com.backportafolio.backportafolio.domain.ports.outputs.PerfilRepositoryPort;

import java.util.List;

public class PerfilUseCaseImpl implements PerfilUseCase {

    public final PerfilRepositoryPort perfilRepositoryPort;

    public PerfilUseCaseImpl(PerfilRepositoryPort perfilRepositoryPort) {
        this.perfilRepositoryPort = perfilRepositoryPort;
    }

    @Override
    public Perfil registrarPerfil(Perfil perfil) throws Exception {
        return perfilRepositoryPort.save(perfil);
    }

    @Override
    public List<Perfil> obtenerPerfil() throws Exception {
        return perfilRepositoryPort.findAll();
    }
}
