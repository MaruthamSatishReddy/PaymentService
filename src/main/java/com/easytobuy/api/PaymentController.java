package com.easytobuy.api;

import com.easytobuy.model.PaymentRequest;
import com.easytobuy.model.PaymentResponse;
import com.easytobuy.service.PaymentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/v1/payment")
@CrossOrigin
@AllArgsConstructor
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<PaymentResponse> doPayment(@RequestBody PaymentRequest paymentRequest){
       return new ResponseEntity<>(paymentService.doPayment(paymentRequest), HttpStatus.CREATED);
   }
}
