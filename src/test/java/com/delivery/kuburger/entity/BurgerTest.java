package com.delivery.kuburger.entity;

import junitx.extensions.EqualsHashCodeTestCase;

public class BurgerTest extends EqualsHashCodeTestCase {

    public BurgerTest(String name) {
        super(name);
    }

    @Override
    protected Object createInstance() throws Exception {
        return new Burger("Batataj");
    }

    @Override
    protected Object createNotEqualInstance() throws Exception {
        return new Burger("El Picante");
    }
}
