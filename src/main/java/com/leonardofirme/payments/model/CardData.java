// src/main/java/com/leonardofirme/payments/model/CardData.java
package com.leonardofirme.payments.model;

public record CardData(String holderName, String cardNumber, String cvv) {}