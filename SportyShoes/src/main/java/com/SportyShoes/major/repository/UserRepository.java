package com.SportyShoes.major.repository;

import java.util.Optional;

import com.SportyShoes.major.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

    Optional <User>  findUserByEmail(String email);
}
