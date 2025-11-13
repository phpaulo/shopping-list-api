package com.shoppinglist.api.repository;

import com.shoppinglist.api.entity.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;

// This repository will handle the ShoppingList entity, for basic database operations such as saving, searching, deleting, and updating.
public interface ShoppingListRepository extends JpaRepository<ShoppingList, Long> {

}
