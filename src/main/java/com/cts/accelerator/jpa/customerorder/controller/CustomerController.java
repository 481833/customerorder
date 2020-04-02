package com.cts.accelerator.jpa.customerorder.controller;

import com.cts.accelerator.jpa.customerorder.domain.Customer;
import com.cts.accelerator.jpa.customerorder.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/{customerId}")
    public Customer getCustomerById(@PathVariable Long customerId) {
        return customerService.getCustomerById(customerId);
    }

    @PostMapping("/customers")
    public Customer createCustomer(@Valid @RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/customers/{customerId}")
    public Customer updateCustomer(@PathVariable Long customerId, @Valid @RequestBody Customer customer) {
        return customerService.updateCustomer(customerId,customer);
    }

    @DeleteMapping("/customers/{customerId}")
    public void deleteCustomer(@PathVariable Long customerId) {
       customerService.deleteCustomer(customerId);
    }
}
