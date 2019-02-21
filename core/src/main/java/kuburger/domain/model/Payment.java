package kuburger.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter @Setter
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Order order;
    private PaymentStatus status;

    public Payment(Order order) {
        this.order = order;
        this.status = PaymentStatus.PENDING;
    }

    public void pay() {
        status = PaymentStatus.PAID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(order, payment.order) &&
                status == payment.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, status);
    }
}
