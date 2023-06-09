package com.israelsouza123.springvscode.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.israelsouza123.springvscode.entidade.Usuario;
import com.israelsouza123.springvscode.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

  @Autowired
  private UserRepository repository;

  @GetMapping
  public List<Usuario> findAll() {
    List<Usuario> result = repository.findAll();
    return result;
  }

  @GetMapping(value = "/{id}")
  public Usuario findById(@PathVariable Long id) {
    Usuario result = repository.findById(id).get();
    return result;
  }

  @PostMapping(value = "/{id}")
  public Usuario insert(@RequestBody Usuario user) {
    Usuario result = repository.save(user);
    return result;
  }

}