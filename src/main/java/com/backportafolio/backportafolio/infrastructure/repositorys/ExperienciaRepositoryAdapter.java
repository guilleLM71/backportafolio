package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.Experiencia;
import com.backportafolio.backportafolio.domain.ports.outputs.ExperienciaRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ExperienciaRepositoryAdapter implements ExperienciaRepositoryPort {

    private final ExperienciaRepository experienciaRepository;

    public ExperienciaRepositoryAdapter(ExperienciaRepository experienciaRepository) {
        this.experienciaRepository = experienciaRepository;
    }

    @Override
    public Experiencia save(Experiencia experiencia) throws Exception {
        return experienciaRepository.save(experiencia);
    }

    @Override
    public List<Experiencia> findAll() throws Exception {
        return experienciaRepository.findAll();
    }
}
