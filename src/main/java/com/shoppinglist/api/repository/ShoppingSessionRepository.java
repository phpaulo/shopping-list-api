package com.shoppinglist.api.repository;

import com.shoppinglist.api.entity.ShoppingSession;
import org.springframework.data.jpa.repository.JpaRepository;

// This repository will handle the ShoppingSession entity, for basic database operations such as saving, searching, deleting, and updating.
public interface ShoppingSessionRepository extends JpaRepository<ShoppingSession, Long> {

}
