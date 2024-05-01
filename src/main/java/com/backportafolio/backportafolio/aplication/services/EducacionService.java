package com.backportafolio.backportafolio.aplication.services;

import com.backportafolio.backportafolio.domain.models.Educacion;
import com.backportafolio.backportafolio.domain.ports.inputs.EducacionUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EducacionService implements EducacionUseCase {
    private final EducacionUseCase educacionUseCase;

    public EducacionService(EducacionUseCase educacionUseCase) {
        this.educacionUseCase = educacionUseCase;
    }

    @Override
    public Educacion registrarEducacion(Educacion educacion) throws Exception {
        return educacionUseCase.registrarEducacion(educacion);
    }

    @Override
    public List<Educacion> obtenerEducacion() throws Exception {
        return educacionUseCase.obtenerEducacion();
    }
}
