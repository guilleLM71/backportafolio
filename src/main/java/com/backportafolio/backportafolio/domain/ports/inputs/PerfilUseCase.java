package com.backportafolio.backportafolio.domain.ports.inputs;

import com.backportafolio.backportafolio.domain.models.Perfil;

import java.util.List;

public interface PerfilUseCase {
    Perfil registrarPerfil(Perfil perfil) throws Exception;
    List<Perfil> obtenerPerfil() throws Exception;
}


