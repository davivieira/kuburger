package kuburger.domain.model;

import junitx.extensions.EqualsHashCodeTestCase;

import java.util.Collections;
import java.util.List;

public class OrderTest extends EqualsHashCodeTestCase {

    private Order orderEqual;
    private Order orderNotEqual;
    private final Client client = new Client(new Address(), "Testêncio");
    private final List<Product> products = Collections.emptyList();

    public OrderTest(String name) {
        super(name);
    }

    @Override
    protected Object createInstance() {
        orderEqual = new Order(products, client);
        orderEqual.setAmount(10.0);
        return orderEqual;
    }

    @Override
    protected Object createNotEqualInstance() {
        orderNotEqual = new Order(products, client);
        orderNotEqual.setAmount(20.0);
        return orderNotEqual;
    }
}
