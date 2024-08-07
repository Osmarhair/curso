package com.estudo.curso.entidades.enums;

public enum OrderStatus {
    WAIING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }
    public Integer getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
        }
        throw new IllegalArgumentException("invalid OrderStatus code");
    }
        return null;
}
    OrderStatus valueOf(OrderStatus orderStatus) {
        
        throw new UnsupportedOperationException("Unimplemented method 'valueOf'");
    }
}
