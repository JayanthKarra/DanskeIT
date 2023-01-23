package com.abs;

import java.math.BigDecimal;

class SalariedEmployee extends Employee {
    SalariedEmployee(String name, BigDecimal salary) {
        super(name);
        this.salary = salary;
    }
    public String toString() {
        return getClass().getSimpleName() + " " + name + " " + salary;
    }
    final BigDecimal salary;
}