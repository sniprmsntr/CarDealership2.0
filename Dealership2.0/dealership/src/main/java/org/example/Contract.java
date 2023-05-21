package org.example;

import java.math.BigDecimal;

public abstract class Contract {
    protected String date;
    protected String customerName;
    protected String customerEmail;
    protected String vehicleSold;

    public Contract(String date, String customerName, String customerEmail, String vehicleSold) {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
    }

    public abstract BigDecimal getTotalPrice();
    public abstract BigDecimal getMonthlyPayment();

    // getters and setters
}

