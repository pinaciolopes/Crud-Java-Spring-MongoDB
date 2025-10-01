package com.pablo.mongodb_spring.infrastructure.entitys;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "usuarios")
public class Usuario {

    @Id
    private String id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("idade")
    private Integer idade;
}
