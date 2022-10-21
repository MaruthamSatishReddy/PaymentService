package com.easytobuy.service;

import com.easytobuy.entity.TransactionDetails;
import com.easytobuy.model.PaymentRequest;
import com.easytobuy.model.PaymentResponse;
import com.easytobuy.repository.PaymentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentRepository paymentRepository;
    @Override
    public PaymentResponse doPayment(PaymentRequest paymentRequest) {
        TransactionDetails transactionDetails=TransactionDetails.builder()
                .paymentId(UUID.randomUUID().toString().split("-")[0])
                .amount(paymentRequest.getAmount())
                .paymentMode(paymentRequest.getPaymentMode())
                .paymentStatus(paymentRequest.getPaymentStatus())
                .referenceNumber(paymentRequest.getReferenceNumber())
                .paymentDate(Instant.now())
                .build();
        log.info("TransactionDetails: {}"+transactionDetails);
        paymentRepository.save(transactionDetails);
        return PaymentResponse.builder().paymentId(transactionDetails.getPaymentId()).build();
    }
}
