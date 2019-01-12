package com.delivery.kuburger.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;

    private Client client;
    @Setter @Getter private String email;
    private int phoneNumber;

    public Contact(Client client, int phoneNumber) {
        this.client = client;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return phoneNumber == contact.phoneNumber &&
                Objects.equals(client, contact.client) &&
                Objects.equals(email, contact.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, email, phoneNumber);
    }
}
