package kuburger.domain.model;

import junitx.extensions.EqualsHashCodeTestCase;

public class ClientTest extends EqualsHashCodeTestCase {

    private final Address address = new Address();

    public ClientTest(String name) {
        super(name);
    }

    @Override
    protected Object createInstance() {
        return new Client(address, "Testêncio");
    }

    @Override
    protected Object createNotEqualInstance() {
        return new Client(address, "Testovânio");
    }
}
