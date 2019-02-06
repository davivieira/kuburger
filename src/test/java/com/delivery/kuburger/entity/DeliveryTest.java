package com.delivery.kuburger.entity;

import junitx.extensions.EqualsHashCodeTestCase;

import java.util.Collections;

public class DeliveryTest extends EqualsHashCodeTestCase {

    private final Client client = new Client(new Address(), "Testenzo");
    private final Order order = new Order(Collections.emptyList(), client);

    public DeliveryTest(String name) {
        super(name);
    }

    @Override
    protected Object createInstance() throws Exception {
        return new Delivery(order, new Address());
    }

    @Override
    protected Object createNotEqualInstance() throws Exception {
        Address address = new Address();
        address.setCity("Fortaleza");
        return new Delivery(order, address);
    }
}
