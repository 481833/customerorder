package com.cts.accelerator.jpa.customerorder.repository;

import com.cts.accelerator.jpa.customerorder.domain.OrderPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderPaymentRepository extends JpaRepository<OrderPayment, Long> {
}
