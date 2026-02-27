// src/test/java/com/leonardofirme/payments/strategies/CreditCardPaymentTest.java
package com.leonardofirme.payments.strategies;

import com.leonardofirme.payments.model.CardData;
import com.leonardofirme.payments.exception.PaymentException;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardPaymentTest {

    @Test
    void shouldThrowExceptionWhenLimitIsExceeded() {
        CardData card = new CardData("LEONARDO", "12345678", "123");
        CreditCardPayment payment = new CreditCardPayment(card);

        // Valida se a exceção correta é lançada ao passar o limite
        assertThrows(PaymentException.class, () -> {
            payment.processPayment(new BigDecimal("1100.00"));
        });
    }

    @Test
    void shouldProcessPaymentWhenWithinLimit() {
        CardData card = new CardData("LEONARDO", "12345678", "123");
        CreditCardPayment payment = new CreditCardPayment(card);

        // Não deve lançar exceção
        assertDoesNotThrow(() -> {
            payment.processPayment(new BigDecimal("500.00"));
        });
    }
}