package com.backportafolio.backportafolio.aplication.services;

import com.backportafolio.backportafolio.domain.models.Habilidades;
import com.backportafolio.backportafolio.domain.ports.inputs.HabilidadesUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HabilidadesService implements HabilidadesUseCase {
    public final HabilidadesUseCase habilidadesUseCase;

    public HabilidadesService(HabilidadesUseCase habilidadesUseCase) {
        this.habilidadesUseCase = habilidadesUseCase;
    }


    @Override
    public Habilidades registrarHabilidades(Habilidades habilidades) throws Exception {
        return habilidadesUseCase.registrarHabilidades(habilidades);
    }

    @Override
    public List<Habilidades> obtenerHabilidades() throws Exception {
        return habilidadesUseCase.obtenerHabilidades();
    }
}
