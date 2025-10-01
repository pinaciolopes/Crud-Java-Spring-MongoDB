package com.pablo.mongodb_spring.controller;

import com.pablo.mongodb_spring.infrastructure.entitys.Usuario;
import com.pablo.mongodb_spring.business.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {this.service = service;}
    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario){return service.salvar(usuario);}

    @GetMapping
    public List<Usuario> listar(){return service.listar();}

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable String id){return service.buscarId(id);}

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id){service.deletar(id);}

    @PutMapping("/{id}")
    public void Atualizar(@PathVariable String id, @RequestBody Usuario usuario){ service.atualizarParcial(id, usuario);}


}
