package com.cts.accelerator.jpa.customerorder.repository;

import com.cts.accelerator.jpa.customerorder.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
}
