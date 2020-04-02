package com.cts.accelerator.jpa.customerorder.service;


import com.cts.accelerator.jpa.customerorder.RecordNotFoundException;
import com.cts.accelerator.jpa.customerorder.domain.Order;
import com.cts.accelerator.jpa.customerorder.repository.CustomerRepository;
import com.cts.accelerator.jpa.customerorder.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllorders() {
        return orderRepository.findAll();
    }

    public Order getorderById(Long id) {
        return  orderRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("order not found on :: " + id));
    }

    public List<Order> getOrderByCustomer(Long customerId) {
        return orderRepository.findByCustomerId(customerId);
    }

    public Order createOrder(Long customerId, Order order) {
        return customerRepository.findById(customerId)
                .map(customer -> {
                    order.setCustomer(customer);
                    return orderRepository.save(order);
                }).orElseThrow(() -> new RecordNotFoundException("Customer not found with id " + customerId));
    }

    public Order updateOrder(Long customerId, Long orderId, Order orderRec) {

        if(!customerRepository.existsById(customerId)) {
            throw new RuntimeException("Customer not found with id " + customerId);
        }

        return orderRepository.findById(orderId)
                .map(order -> {
                    order.setOrderDate(orderRec.getOrderDate());
                    order.setOrderStatus(orderRec.getOrderStatus());
                    order.setShippingDate(orderRec.getShippingDate());
                    return orderRepository.save(order);
                }).orElseThrow(() -> new RecordNotFoundException("order not found with id " + orderId));
    }

    public void deleteOrder(Long customerId, Long orderId) {

        if(!customerRepository.existsById(customerId)) {
            throw new RuntimeException("Customer not found with id " + customerId);
        }

        Order order =
                orderRepository
                        .findById(orderId)
                        .orElseThrow(() -> new RecordNotFoundException("order not found on :: " + orderId));

        orderRepository.delete(order);
    }
}
