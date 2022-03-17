package dev.lucas.hrpayroll.controllers

import dev.lucas.hrpayroll.services.PaymentService
import entities.Payment
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payments")
class PaymentController (val paymentService: PaymentService){

    @GetMapping("/{workerId}")
    fun getPayment (@PathVariable workerId: Long, @RequestParam days: Int): ResponseEntity<Payment> {
        return ResponseEntity.ok(paymentService.getPayment(workerId, days));
    }
}