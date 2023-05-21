package org.example;

public class SalesContract extends Contract {
    private BigDecimal salesTax;
    private BigDecimal recordingFee;
    private BigDecimal processingFee;
    private boolean isFinanced;

    // constructor, getters and setters

    @Override
    public BigDecimal getTotalPrice() {
        // calculate total price
    }

    @Override
    public BigDecimal getMonthlyPayment() {
        // calculate monthly payment
    }
}
