package com.shoppinglist.api.repository;

import com.shoppinglist.api.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

// This repository will be responsible for the CartItem entity, for basic database operations such as saving, searching, deleting, and updating.
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
