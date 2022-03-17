package dev.lucas.hrpayroll.services

import entities.Payment
import org.springframework.stereotype.Service

@Service
class PaymentService {

    fun getPayment (workerId: Long, days: Int ) : Payment {
        return Payment("Lucas", 200.0, days)
    }
}