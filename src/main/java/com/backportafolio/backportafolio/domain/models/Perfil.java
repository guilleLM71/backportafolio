package com.backportafolio.backportafolio.domain.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "perfil")
public class Perfil {
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private Date fechaNacimiento;
    private String gradoAcademico;
    private int experienciaLaboral;
    private String perfil;
}
