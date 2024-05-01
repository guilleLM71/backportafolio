package com.backportafolio.backportafolio.domain.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "habilidades")
public class Habilidades {
    private String habilidad;
}
