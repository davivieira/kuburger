package kuburger.domain.model;

import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;

@Getter
public class Delivery implements Serializable {

    private static final long serialVersionUID = 1L;

    private Order order;
    private Address address;

    public Delivery(Order order, Address address) {
        this.order = order;
        this.address = address;
    }

    public void deliver() {
        this.order.deliver();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return Objects.equals(order, delivery.order) &&
                Objects.equals(address, delivery.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, address);
    }
}
