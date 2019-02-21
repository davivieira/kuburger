package kuburger.domain.model;

import junitx.extensions.EqualsHashCodeTestCase;

import java.util.Collections;

public class PaymentTest extends EqualsHashCodeTestCase {

    private Order order;
    private final Address address = new Address();
    private final Client client = new Client(address, "Testêncio");
    public Payment paymentEqual;
    public Payment paymentNotEqual;

    public PaymentTest(String name) {
        super(name);
    }

    @Override
    protected Object createInstance() {
        order = getMockedOrder();
        paymentEqual = new Payment(order);
        return paymentEqual;
    }

    @Override
    protected Object createNotEqualInstance() {
        order = getMockedOrder();
        paymentNotEqual = new Payment(order);
        paymentNotEqual.setStatus(PaymentStatus.PAID); // Difference
        return paymentNotEqual;
    }

    private Order getMockedOrder() {
        if (order != null) {
            return order;
        }

        order = new Order(Collections.emptyList(), client);
        order.setAmount(99.99);

        return order;
    }

}
