// src/main/java/com/leonardofirme/payments/strategies/PaymentStrategy.java
package com.leonardofirme.payments.strategies;

import java.math.BigDecimal;

public interface PaymentStrategy {
    void processPayment(BigDecimal amount);
    String getPaymentMethodName();
}