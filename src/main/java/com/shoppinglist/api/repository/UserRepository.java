package com.shoppinglist.api.repository;

import com.shoppinglist.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// This repository will be used for operations with the User entity, for basic database operations such as saving, searching, deleting, and updating.
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
