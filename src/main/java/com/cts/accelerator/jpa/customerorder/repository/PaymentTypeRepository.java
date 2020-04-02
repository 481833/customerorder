package com.cts.accelerator.jpa.customerorder.repository;

import com.cts.accelerator.jpa.customerorder.domain.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentTypeRepository extends JpaRepository<PaymentType, Long> {
}
