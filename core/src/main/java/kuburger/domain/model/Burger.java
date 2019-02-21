package kuburger.domain.model;

import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;

@Getter
public class Burger extends Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public Burger(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Burger burger = (Burger) o;
        return Objects.equals(name, burger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
