package com.backportafolio.backportafolio.domain.ports.inputs;

import com.backportafolio.backportafolio.domain.models.Experiencia;

import java.util.List;

public interface ExperienciaUseCase {
    Experiencia registrarExperiencia(Experiencia experiencia) throws Exception;
    List<Experiencia> obtenerExperiencia() throws Exception;
}
