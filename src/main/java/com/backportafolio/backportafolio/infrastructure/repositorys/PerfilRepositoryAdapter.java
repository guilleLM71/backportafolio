package com.backportafolio.backportafolio.infrastructure.repositorys;

import com.backportafolio.backportafolio.domain.models.Perfil;
import com.backportafolio.backportafolio.domain.ports.outputs.PerfilRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PerfilRepositoryAdapter implements PerfilRepositoryPort {

    public final PerfilRepository perfilRepository;

    public PerfilRepositoryAdapter(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    @Override
    public Perfil save(Perfil perfil) throws Exception {
        if(perfil!=null)
        {
            return perfilRepository.save(perfil);
        }
        throw new Exception("Perfil is null");
    }

    @Override
    public List<Perfil> findAll() throws Exception {
        List<Perfil>perfiles=perfilRepository.findAll();
        if(perfiles!=null)
        {
            return perfiles;
        }
        throw new Exception("Perfiles is null");
    }
}
