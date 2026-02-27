// src/main/java/com/leonardofirme/payments/core/PaymentProcessor.java
package com.leonardofirme.payments.core;

import com.leonardofirme.payments.strategies.PaymentStrategy;
import java.math.BigDecimal;

public class PaymentProcessor {
    private PaymentStrategy strategy;

    /**
     * Define a estratégia de pagamento em tempo de execução.
     * Aceita qualquer classe que implemente PaymentStrategy.
     */
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(BigDecimal amount) {
        if (this.strategy == null) {
            throw new IllegalStateException("ERRO: Nenhuma estratégia de pagamento foi configurada.");
        }
        this.strategy.processPayment(amount);
    }
}