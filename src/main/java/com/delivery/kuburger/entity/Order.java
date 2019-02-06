package com.delivery.kuburger.entity;

import lombok.Getter;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private Double amount;
    private OrderStatus status;
    private List<Product> products;
    private Client client;

    public Order(List<Product> products, Client client) {
        this.products = products;
        this.client = client;
        this.setStatus(OrderStatus.OPENED);
    }

    public void checkout() {
        this.setStatus(OrderStatus.PENDING_PAYMENT);
        // Pay
    }

    public void finishPreparation() {
        this.setStatus(OrderStatus.PENDING_DELIVERY);
    }

    public void deliver() {
        this.setStatus(OrderStatus.DELIVERED);
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    private void setStatus(OrderStatus status) {
        this.status = status;
    }

    public double calculateAmount() {
        return products.stream()
                .map(Product::getPrice)
                .reduce(amount, (sum, nextPrice) -> sum+nextPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                Double.compare(order.amount, amount) == 0 &&
                status == order.status &&
                Objects.equals(products, order.products) &&
                Objects.equals(client, order.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, status, products, client);
    }
}
