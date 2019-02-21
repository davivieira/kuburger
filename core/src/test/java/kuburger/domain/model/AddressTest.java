package kuburger.domain.model;

import junitx.extensions.EqualsHashCodeTestCase;

public class AddressTest extends EqualsHashCodeTestCase {

    public AddressTest(String name) {
        super(name);
    }

    @Override
    protected Object createInstance() {
        return new Address();
    }

    @Override
    protected Object createNotEqualInstance() {
        Address address = new Address();
        address.setCity("Fortaleza");
        return address;
    }
}
