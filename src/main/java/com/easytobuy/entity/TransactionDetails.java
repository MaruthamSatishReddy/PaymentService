package com.easytobuy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
@Document(collection = "TRANSACTION_DETAILS")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDetails {
    @Id
    private String paymentId;
    private String orderId;
    private String paymentMode;
    private String referenceNumber;
    private Instant paymentDate;
    private String paymentStatus;
    private long amount;
}
