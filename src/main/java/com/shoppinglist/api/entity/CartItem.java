package com.shoppinglist.api.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

// The CartItem class represents an item that has been added to the cart during a shopping session.

@Entity
@Table(name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_name", nullable = false)
    private String itemName;

    @Column(nullable = false)
    private BigDecimal quantity;

    @Column(name = "unit_price", nullable = false)
    private BigDecimal unitPrice;

    @Column(nullable = false)
    private BigDecimal subtotal;

    @Column(name = "added_at")
    private LocalDateTime addedAt;

    @ManyToOne
    @JoinColumn(name = "shopping_session_id", nullable = false)
    private ShoppingSession shoppingSession;

    public CartItem() {
    }

    public CartItem(Long id, String itemName, BigDecimal quantity, BigDecimal unitPrice, BigDecimal subtotal, LocalDateTime addedAt, ShoppingSession shoppingSession) {
        this.id = id;
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subtotal = subtotal;
        this.addedAt = addedAt;
        this.shoppingSession = shoppingSession;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public LocalDateTime getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(LocalDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public ShoppingSession getShoppingSession() {
        return shoppingSession;
    }

    public void setShoppingSession(ShoppingSession shoppingSession) {
        this.shoppingSession = shoppingSession;
    }
}
