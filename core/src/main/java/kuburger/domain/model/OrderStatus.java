package kuburger.domain.model;

public enum OrderStatus {
    OPENED("Opened"),
    PENDING_PAYMENT("Pending Payment"),
    PENDING_DELIVERY("Pending Delivery"),
    DELIVERED("Delivered");

    private String value;

    OrderStatus(String value) {
        this.value = value;
    }

    public String getCode() {
        return super.toString();
    }

    public String getValue() {
        return value;
    }
}
