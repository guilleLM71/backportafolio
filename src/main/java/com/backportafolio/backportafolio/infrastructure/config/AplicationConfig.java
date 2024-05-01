package com.backportafolio.backportafolio.infrastructure.config;

import com.backportafolio.backportafolio.aplication.services.*;
import com.backportafolio.backportafolio.aplication.usecases.*;
import com.backportafolio.backportafolio.domain.ports.outputs.*;
import com.backportafolio.backportafolio.infrastructure.repositorys.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AplicationConfig {

    @Bean
    public PerfilService perfilService(PerfilRepositoryPort perfilRepositoryPort){
        return new PerfilService(new PerfilUseCaseImpl(perfilRepositoryPort));
    }

    @Bean
    public PerfilRepositoryPort perfilRepositoryPort(PerfilRepositoryAdapter perfilRepositoryAdapter){
        return perfilRepositoryAdapter;
    }

    @Bean
    public HabilidadesService habilidadesService(HabilidadesRepositoryPort habilidadesRepositoryPort){
        return new HabilidadesService(new HabilidadesUseCaseImpl(habilidadesRepositoryPort));
    }
    @Bean
    public HabilidadesRepositoryPort habilidadesRepositoryPort(HabilidadesRepositoryAdapter habilidadesRepositoryAdapter){
        return habilidadesRepositoryAdapter;
    }

    @Bean
    public SkillPrimService skillPrimService(SkillPrimRepositoryPort skillPrimRepositoryPort){
        return new SkillPrimService(new SkillPrimUseCaseImpl(skillPrimRepositoryPort));
    }
    @Bean
    public SkillPrimRepositoryPort skillPrimRepositoryPort(SkillPrimRepositoryAdapter skillPrimRepositoryAdapter){
        return skillPrimRepositoryAdapter;
    }
    @Bean
    public SkillSecService skillSecService(SkillSecRepositoryPort skillSecRepositoryPort){
        return new SkillSecService(new SkillSecUseCaseImpl(skillSecRepositoryPort));
    }
    @Bean
    public SkillSecRepositoryPort skillSecRepositoryPort(SkillSecRepositoryAdapter skillSecRepositoryAdapter){
        return skillSecRepositoryAdapter;
    }
    @Bean
    public EducacionService educacionService(EducacionRepositoryPort educacionRepositoryPort){
        return new EducacionService(new EducacionUseCaseImpl(educacionRepositoryPort));
    }
    @Bean
    public EducacionRepositoryPort educacionRepositoryPort(EducacionRepositoryAdapter educacionRepositoryAdapter){
        return educacionRepositoryAdapter;
    }
    @Bean
    public ExperienciaService experienciaService(ExperienciaRepositoryPort experienciaRepositoryPort){
        return new ExperienciaService(new ExperienciaUseCaseImpl(experienciaRepositoryPort));
    }
    @Bean
    public ExperienciaRepositoryPort experienciaRepositoryPort(ExperienciaRepositoryAdapter experienciaRepositoryAdapter){
        return experienciaRepositoryAdapter;
    }
    @Bean
    public ProyectosService proyectoService(ProyectosRepositoryPort proyectoRepositoryPort){
        return new ProyectosService(new ProyectosUseCaseImpl(proyectoRepositoryPort));
    }
    @Bean
    public ProyectosRepositoryPort proyectoRepositoryPort(ProyectosRepositoryAdapter proyectoRepositoryAdapter){
        return proyectoRepositoryAdapter;
    }



}
