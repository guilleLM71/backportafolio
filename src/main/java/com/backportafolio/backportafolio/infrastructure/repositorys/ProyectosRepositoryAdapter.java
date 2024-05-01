package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.Proyectos;
import com.backportafolio.backportafolio.domain.ports.outputs.ProyectosRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProyectosRepositoryAdapter implements ProyectosRepositoryPort {

    public final ProyectosRepository proyectosRepository;

    public ProyectosRepositoryAdapter(ProyectosRepository proyectosRepository) {
        this.proyectosRepository = proyectosRepository;
    }

    @Override
    public Proyectos save(Proyectos proyectos) throws Exception {
        return proyectosRepository.save(proyectos);
    }

    @Override
    public List<Proyectos> findAll() throws Exception {
        return proyectosRepository.findAll();
    }
}
