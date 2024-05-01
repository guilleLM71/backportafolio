package com.backportafolio.backportafolio.domain.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "educacion")
public class Educacion {
    private String grado;
    private String institucion;
    private String fecha;
}
