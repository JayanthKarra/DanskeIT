package com.abs;

import java.math.BigDecimal;
class HourlyEmployee extends Employee {
    HourlyEmployee(String name, BigDecimal hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }
    public String toString() {
        return getClass().getSimpleName() + " " + name + " " + hourlyRate;
    }
    final BigDecimal hourlyRate;
}