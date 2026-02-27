// src/main/java/com/leonardofirme/payments/App.java
package com.leonardofirme.payments;

import com.leonardofirme.payments.core.PaymentProcessor;
import com.leonardofirme.payments.exception.PaymentException;
import com.leonardofirme.payments.model.CardData;
import com.leonardofirme.payments.strategies.CreditCardPayment;
import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Dados sensíveis protegidos pelo Record CardData
        CardData myCard = new CardData("LEONARDO FIRME", "4444 5555 6666 7777", "123");

        try {
            System.out.println("Iniciando processamento de pagamento...");

            processor.setPaymentStrategy(new CreditCardPayment(myCard));

            // Simulação: R$ 1500.00 excede o limite de R$ 1000.00 definido em CreditCardPayment
            processor.execute(new BigDecimal("1500.00"));

        } catch (PaymentException e) {
            // Captura profissional de exceções de regra de negócio
            System.err.println("STATUS: NEGADO");
            System.err.println("MOTIVO: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("ERRO INESPERADO: " + e.getMessage());
        }
    }
}