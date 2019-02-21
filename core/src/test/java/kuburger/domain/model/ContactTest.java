package kuburger.domain.model;

import junitx.extensions.EqualsHashCodeTestCase;

public class ContactTest extends EqualsHashCodeTestCase {

    private final Client client = new Client(new Address(), "Testêncio");

    public ContactTest(String name) {
        super(name);
    }

    @Override
    protected Object createInstance() {
        return new Contact(client, 2345678);
    }

    @Override
    protected Object createNotEqualInstance() {
        Contact contact = new Contact(client, 2666968);
        contact.setEmail("tester@test.te");
        return contact;
    }
}
