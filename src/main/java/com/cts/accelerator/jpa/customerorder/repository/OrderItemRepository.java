package com.cts.accelerator.jpa.customerorder.repository;

import com.cts.accelerator.jpa.customerorder.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
