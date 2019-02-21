package kuburger.domain.model;

import junitx.extensions.EqualsHashCodeTestCase;

import java.util.Collections;

public class DeliveryTest extends EqualsHashCodeTestCase {

    private final Client client = new Client(new Address(), "Testenzo");
    private final Order order = new Order(Collections.emptyList(), client);

    public DeliveryTest(String name) {
        super(name);
    }

    @Override
    protected Object createInstance() {
        return new Delivery(order, new Address());
    }

    @Override
    protected Object createNotEqualInstance() {
        Address address = new Address();
        address.setCity("Fortaleza");
        return new Delivery(order, address);
    }
}
