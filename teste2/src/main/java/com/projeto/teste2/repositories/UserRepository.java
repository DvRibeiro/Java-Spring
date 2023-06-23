package com.projeto.teste2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.teste2.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
