package com.backportafolio.backportafolio.domain.ports.inputs;

import com.backportafolio.backportafolio.domain.models.Habilidades;

import java.util.List;

public interface HabilidadesUseCase {
    Habilidades registrarHabilidades(Habilidades habilidades) throws Exception;
    List<Habilidades> obtenerHabilidades() throws Exception;
}
