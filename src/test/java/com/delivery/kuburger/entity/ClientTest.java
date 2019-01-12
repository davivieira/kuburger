package com.delivery.kuburger.entity;

import junitx.extensions.EqualsHashCodeTestCase;

public class ClientTest extends EqualsHashCodeTestCase {

    private final Address address = new Address();

    public ClientTest(String name) {
        super(name);
    }

    @Override
    protected Object createInstance() throws Exception {
        return new Client(address, "Testêncio");
    }

    @Override
    protected Object createNotEqualInstance() throws Exception {
        return new Client(address, "Testovânio");
    }
}
