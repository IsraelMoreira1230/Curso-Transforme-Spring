package com.israelsouza123.springvscode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.israelsouza123.springvscode.entidade.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}