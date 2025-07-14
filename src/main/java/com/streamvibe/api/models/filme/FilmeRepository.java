package com.streamvibe.api.models.filme;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Integer>{   // não aceita tipos primitivos somente wrapperclasses

}