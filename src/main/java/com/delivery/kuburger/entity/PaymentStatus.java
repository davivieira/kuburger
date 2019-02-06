package com.delivery.kuburger.entity;

public enum PaymentStatus {
    PENDING("Pending"), PAID("Paid");

    private String value;

    PaymentStatus(String value) {
        this.value = value;
    }

    public String getCode() {
        return super.toString();
    }

    public String getValue() {
        return value;
    }
}
