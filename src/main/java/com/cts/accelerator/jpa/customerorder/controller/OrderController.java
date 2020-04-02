package com.cts.accelerator.jpa.customerorder.controller;

import com.cts.accelerator.jpa.customerorder.domain.Order;
import com.cts.accelerator.jpa.customerorder.service.CustomerService;
import com.cts.accelerator.jpa.customerorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllorders() {
        return orderService.getAllorders();
    }

    @GetMapping("/orders/{orderId}")
    public Order getorderById(@PathVariable Long orderId) {
        return orderService.getorderById(orderId);
    }

    @GetMapping("/customers/{customerId}/orders")
    public List<Order> getorderByCustomer(@PathVariable Long customerId) {
        return orderService.getOrderByCustomer(customerId);
    }

    @PostMapping("/customers/{customerId}/orders")
    public Order createorder(@PathVariable Long customerId, @Valid @RequestBody Order order) {
        return orderService.createOrder(customerId, order);
    }

    @PutMapping("/customers/{customerId}/orders/{orderId}")
    public Order updateorder(@PathVariable Long customerId, @PathVariable Long orderId, @Valid @RequestBody Order order) {
        return orderService.updateOrder(customerId, orderId, order);
    }

    @DeleteMapping("/customers/{customerId}/orders/{orderId}")
    public void deleteorder(@PathVariable Long customerId, @PathVariable Long orderId) {
        orderService.deleteOrder(customerId, orderId);
    }
}
