// src/main/java/com/leonardofirme/payments/strategies/CreditCardPayment.java
package com.leonardofirme.payments.strategies;

import com.leonardofirme.payments.model.CardData;
import com.leonardofirme.payments.exception.PaymentException;
import java.math.BigDecimal;

public class CreditCardPayment implements PaymentStrategy {
    private final CardData card;
    private final BigDecimal limit = new BigDecimal("1000.00"); // Limite simulado

    public CreditCardPayment(CardData card) {
        this.card = card;
    }

    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("--- Validando Cartão de Crédito ---");

        if (amount.compareTo(limit) > 0) {
            throw new PaymentException("Saldo insuficiente no cartão de final: " +
                card.cardNumber().substring(card.cardNumber().length() - 4));
        }

        System.out.println("Pagamento de R$ " + amount + " aprovado para " + card.holderName());
    }

    @Override
    public String getPaymentMethodName() {
        return "Credit Card";
    }
}