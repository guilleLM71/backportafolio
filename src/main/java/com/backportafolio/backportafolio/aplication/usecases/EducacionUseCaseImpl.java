package com.backportafolio.backportafolio.aplication.usecases;

import com.backportafolio.backportafolio.domain.models.Educacion;
import com.backportafolio.backportafolio.domain.ports.inputs.EducacionUseCase;
import com.backportafolio.backportafolio.domain.ports.outputs.EducacionRepositoryPort;

import java.util.List;

public class EducacionUseCaseImpl implements EducacionUseCase {

    private final EducacionRepositoryPort educacionRepositoryPort;

    public EducacionUseCaseImpl(EducacionRepositoryPort educacionRepositoryPort) {
        this.educacionRepositoryPort = educacionRepositoryPort;
    }

    @Override
    public Educacion registrarEducacion(Educacion educacion) throws Exception {
        return educacionRepositoryPort.save(educacion);
    }

    @Override
    public List<Educacion> obtenerEducacion() throws Exception {
        return educacionRepositoryPort.findAll();
    }
}
