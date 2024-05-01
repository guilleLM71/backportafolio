package com.backportafolio.backportafolio.domain.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "experiencia")
public class Experiencia {
    private String tipo;
    private List<String> descripcion;
}
