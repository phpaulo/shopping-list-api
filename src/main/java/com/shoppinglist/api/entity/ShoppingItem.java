package com.shoppinglist.api.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

// The ShoppingItem class is designed to represent an individual item within a shopping list.

@Entity
@Table(name = "shopping_items")
public class ShoppingItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(name = "purchased", nullable = false)
    private boolean purchased;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "shopping_list_id", nullable = false)
    private ShoppingList shoppingList;

    public ShoppingItem() {
    }

    public ShoppingItem(Long id, String name, String description, boolean purchased, LocalDateTime createdAt, ShoppingList shoppingList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.purchased = purchased;
        this.createdAt = createdAt;
        this.shoppingList = shoppingList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ShoppingList getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(ShoppingList shoppingList) {
        this.shoppingList = shoppingList;
    }
}
