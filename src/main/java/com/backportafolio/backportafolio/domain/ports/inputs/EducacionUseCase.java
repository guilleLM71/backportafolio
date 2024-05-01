package com.backportafolio.backportafolio.domain.ports.inputs;

import com.backportafolio.backportafolio.domain.models.Educacion;

import java.util.List;

public interface EducacionUseCase {
    Educacion registrarEducacion(Educacion educacion) throws Exception;
    List<Educacion> obtenerEducacion() throws Exception;
}
