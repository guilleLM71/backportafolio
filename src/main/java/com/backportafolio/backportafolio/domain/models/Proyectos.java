package com.backportafolio.backportafolio.domain.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "proyectos")
public class Proyectos {

    private String[] image;
    private String title;
    private String category;
    private String description;
    private String date;
    private String link;
    private String github;
    private String[] technologies;

}
