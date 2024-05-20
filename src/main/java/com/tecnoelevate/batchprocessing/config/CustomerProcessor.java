package com.tecnoelevate.batchprocessing.config;

import com.tecnoelevate.batchprocessing.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }
}
