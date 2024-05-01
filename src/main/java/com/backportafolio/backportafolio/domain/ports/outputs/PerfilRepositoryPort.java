package com.backportafolio.backportafolio.domain.ports.outputs;

import com.backportafolio.backportafolio.domain.models.Perfil;

import java.util.List;

public interface PerfilRepositoryPort {
    Perfil save(Perfil perfil) throws Exception;
    List<Perfil> findAll() throws Exception;
}
