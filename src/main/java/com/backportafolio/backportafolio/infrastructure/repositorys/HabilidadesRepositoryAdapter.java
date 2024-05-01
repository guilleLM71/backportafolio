package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.Habilidades;
import com.backportafolio.backportafolio.domain.ports.outputs.HabilidadesRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class HabilidadesRepositoryAdapter implements HabilidadesRepositoryPort {

    public final HabilidadesRepository habilidadesRepository;

    public HabilidadesRepositoryAdapter(HabilidadesRepository habilidadesRepository) {
        this.habilidadesRepository = habilidadesRepository;
    }


    @Override
    public Habilidades save(Habilidades habilidades) throws Exception {
        return habilidadesRepository.save(habilidades);
    }

    @Override
    public List<Habilidades> findAll() throws Exception {
        return habilidadesRepository.findAll();
    }
}
