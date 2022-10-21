package com.easytobuy.service;

import com.easytobuy.model.PaymentRequest;
import com.easytobuy.model.PaymentResponse;

public interface PaymentService {
    PaymentResponse doPayment(PaymentRequest paymentRequest);
}
