package com.streamvibe.api.models.filme;
//aqui estão os atributos que podem ser mudados pelo metrodo put 
public record DadosAtualizacaoFilme(
    Integer id,
    String nome,
    String diretor,
    String estudio
) {

}
