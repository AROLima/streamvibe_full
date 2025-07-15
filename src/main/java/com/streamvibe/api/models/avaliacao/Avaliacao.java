package com.streamvibe.api.models.avaliacao;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Avaliacao {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private Long id;
    
    private String nomeListaString;
    private Boolean privada;
    String dadaCriacao;
    

}
