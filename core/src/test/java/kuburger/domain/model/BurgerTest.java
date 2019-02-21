package kuburger.domain.model;

import junitx.extensions.EqualsHashCodeTestCase;

public class BurgerTest extends EqualsHashCodeTestCase {

    public BurgerTest(String name) {
        super(name);
    }

    @Override
    protected Object createInstance() {
        return new Burger("Batataj");
    }

    @Override
    protected Object createNotEqualInstance() {
        return new Burger("El Picante");
    }
}
