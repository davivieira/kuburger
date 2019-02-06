package com.delivery.kuburger.entity;

import junitx.extensions.EqualsHashCodeTestCase;

public class AddressTest extends EqualsHashCodeTestCase {

    public AddressTest(String name) {
        super(name);
    }

    @Override
    protected Object createInstance() throws Exception {
        return new Address();
    }

    @Override
    protected Object createNotEqualInstance() throws Exception {
        Address address = new Address();
        address.setCity("Fortaleza");
        return address;
    }
}
