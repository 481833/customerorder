package com.cts.accelerator.jpa.customerorder.repository;

import com.cts.accelerator.jpa.customerorder.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
