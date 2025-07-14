package com.streamvibe.api.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.streamvibe.api.models.filme.*;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/filme")

public class FilmesController {

    // Injeção de depedência
    @Autowired
    private FilmeRepository repository;

    //Aqui fica o CREATE
    @PostMapping
    @Transactional //faz alterações no banco de dados
    public void cadastrarFilme(@RequestBody DadosCadastroFilme dados) {
        repository.save(new Filme(dados));
    }

    //Aqui fica o READ não precisa do @Transactional pois não altera o BD
    @GetMapping
    public List<Filme> listarFilmes() {
        return repository.findAll();
    }

    //Aqui fica o Update
    @PutMapping
    @Transactional
    public void atualizarFilme(@RequestBody DadosAtualizacaoFilme dados){
        var filme = repository.getReferenceById(dados.id());
        filme.atualizarInformacoes(dados);

    }
    
    //Aqui fica o DELETE real
    // @DeleteMapping("/{id}")
    // @Transactional
    // public void excluirFilmeReal(@PathVariable Integer id) {
    //     repository.deleteById(id);
    // }

    //Aqui vai ficar a exclusão lógica
    @DeleteMapping("/{id}")
    @Transactional
    
    public void excluirFilmeLogico(@PathVariable Integer id){
       var filme = repository.getReferenceById(id);
       filme.exclusaoLogica();
    }


}