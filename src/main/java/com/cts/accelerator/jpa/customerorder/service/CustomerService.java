package com.cts.accelerator.jpa.customerorder.service;

import com.cts.accelerator.jpa.customerorder.RecordNotFoundException;
import com.cts.accelerator.jpa.customerorder.domain.Customer;
import com.cts.accelerator.jpa.customerorder.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return  customerRepository
                  .findById(id)
                    .orElseThrow(() -> new RecordNotFoundException("Customer not found on :: " + id));
    }


    public Customer createCustomer(@Valid @RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Long customerId, Customer customerRec) {
        return customerRepository.findById(customerId)
                .map(customer -> {
                    customer.setName(customerRec.getName());
                    return customerRepository.save(customer);
                }).orElseThrow(() -> new RecordNotFoundException("Customer not found with id " + customerId));
        }

        public void deleteCustomer(Long customerId) {
            Customer customer =
                    customerRepository
                            .findById(customerId)
                            .orElseThrow(() -> new RecordNotFoundException("Customer not found on :: " + customerId));

            customerRepository.delete(customer);
        }
    }
