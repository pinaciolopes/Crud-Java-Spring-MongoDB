package com.pablo.mongodb_spring.business;

import com.pablo.mongodb_spring.infrastructure.entitys.Usuario;
import com.pablo.mongodb_spring.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {this.repository = repository;}

    public Usuario salvar(Usuario usuario){return repository.save(usuario);}

    public List<Usuario> listar(){return repository.findAll();}

    public Usuario buscarId(String id){return repository.findById(id).orElse(null);}

    public void deletar (String id){ repository.deleteById(id);}

    public Usuario atualizarParcial(String id, Usuario usuarioAtualizado){
        Usuario usuarioExistente = repository.findById(id).orElse(null);

        if(usuarioExistente != null){

            if(usuarioAtualizado.getNome() != null){
                usuarioExistente.setNome(usuarioAtualizado.getNome());
            }
            if(usuarioAtualizado.getIdade() != null){
                usuarioExistente.setIdade(usuarioAtualizado.getIdade());
            }
            return repository.save(usuarioExistente);
        }else{
            return null;
        }
    }

    }

