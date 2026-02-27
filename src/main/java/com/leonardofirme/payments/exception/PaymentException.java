// src/main/java/com/leonardofirme/payments/exception/PaymentException.java
package com.leonardofirme.payments.exception;

public class PaymentException extends RuntimeException {
    public PaymentException(String message) {
        super(message);
    }
}