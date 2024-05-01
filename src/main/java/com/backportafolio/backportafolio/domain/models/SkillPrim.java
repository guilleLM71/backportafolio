package com.backportafolio.backportafolio.domain.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "skillPrim")
public class SkillPrim {
    private String skillLanguage;
    private String nivel;

}
