package com.shoppinglist.api.repository;

import com.shoppinglist.api.entity.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;

// This repository will be responsible for the ShoppingItem entity, for basic database operations such as saving, searching, deleting, and updating.
public interface ShoppingItemRepository extends JpaRepository<ShoppingItem, Long> {

}
