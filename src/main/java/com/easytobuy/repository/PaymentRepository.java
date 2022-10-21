package com.easytobuy.repository;

import com.easytobuy.entity.TransactionDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends MongoRepository<TransactionDetails,String> {
}
