package com.payroll.hrpayroll.services;

import com.payroll.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workId, int days) {
        return new Payment("Bob", 200.0, days);
    }

}
