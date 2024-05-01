package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.Educacion;
import com.backportafolio.backportafolio.domain.ports.outputs.EducacionRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EducacionRepositoryAdapter implements EducacionRepositoryPort {

    private final EducacionRepository educacionRepository;

    public EducacionRepositoryAdapter(EducacionRepository educacionRepository) {
        this.educacionRepository = educacionRepository;
    }

    @Override
    public Educacion save(Educacion educacion) throws Exception {
        return educacionRepository.save(educacion);
    }

    @Override
    public List<Educacion> findAll() throws Exception {
        return educacionRepository.findAll();
    }
}
