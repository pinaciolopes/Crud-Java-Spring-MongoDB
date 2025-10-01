package com.pablo.mongodb_spring.infrastructure.repository;

import com.pablo.mongodb_spring.infrastructure.entitys.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    Usuario findByNome(String nome);

    List<Usuario> findByIdade(Integer idade);
}
