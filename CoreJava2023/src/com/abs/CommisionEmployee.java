package com.abs;

import java.math.BigDecimal;

class CommissionEmployee extends Employee {
    CommissionEmployee(String name, BigDecimal percentage) {
        super(name);
        this.percentage = percentage;
    }
    public String toString() {
        return getClass().getSimpleName() + " " + name + " " + percentage + "%";
    }
    final BigDecimal percentage;
}