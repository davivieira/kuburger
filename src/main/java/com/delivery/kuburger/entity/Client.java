package com.delivery.kuburger.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Address> addresses = new ArrayList<>();
    private List<Contact> contacts = new ArrayList<>();
    @Setter private String name;

    public Client(Address address, String name) {
        this.addresses.add(address);
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(addresses, client.addresses) &&
                Objects.equals(contacts, client.contacts) &&
                Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addresses, contacts, name);
    }
}
