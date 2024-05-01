package com.backportafolio.backportafolio.aplication.services;

import com.backportafolio.backportafolio.domain.models.Experiencia;
import com.backportafolio.backportafolio.domain.ports.inputs.ExperienciaUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExperienciaService implements ExperienciaUseCase {
    private final ExperienciaUseCase experienciaUseCase;

    public ExperienciaService(ExperienciaUseCase experienciaUseCase) {
        this.experienciaUseCase = experienciaUseCase;
    }

    @Override
    public Experiencia registrarExperiencia(Experiencia experiencia) throws Exception {
        return experienciaUseCase.registrarExperiencia(experiencia);
    }

    @Override
    public List<Experiencia> obtenerExperiencia() throws Exception {
        return experienciaUseCase.obtenerExperiencia();
    }
}
