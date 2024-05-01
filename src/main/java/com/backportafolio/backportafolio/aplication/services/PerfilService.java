package com.backportafolio.backportafolio.aplication.services;

import com.backportafolio.backportafolio.domain.models.Perfil;
import com.backportafolio.backportafolio.domain.ports.inputs.PerfilUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PerfilService implements PerfilUseCase {

    public final PerfilUseCase perfilUseCase;

    public PerfilService(PerfilUseCase perfilUseCase) {
        this.perfilUseCase = perfilUseCase;
    }

    @Override
    public Perfil registrarPerfil(Perfil perfil) throws Exception {
        return perfilUseCase.registrarPerfil(perfil);
    }

    @Override
    public List<Perfil> obtenerPerfil() throws Exception {
        return perfilUseCase.obtenerPerfil();
    }
}
