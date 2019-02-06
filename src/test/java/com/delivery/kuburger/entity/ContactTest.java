package com.delivery.kuburger.entity;

import junitx.extensions.EqualsHashCodeTestCase;

public class ContactTest extends EqualsHashCodeTestCase {

    private final Client client = new Client(new Address(), "Testêncio");

    public ContactTest(String name) {
        super(name);
    }

    @Override
    protected Object createInstance() throws Exception {
        return new Contact(client, 2345678);
    }

    @Override
    protected Object createNotEqualInstance() throws Exception {
        Contact contact = new Contact(client, 2666968);
        contact.setEmail("tester@test.te");
        return contact;
    }
}
