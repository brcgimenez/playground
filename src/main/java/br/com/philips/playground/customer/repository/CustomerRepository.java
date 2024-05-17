package br.com.philips.playground.customer.repository;

import br.com.philips.playground.customer.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    Customer save(Customer customer);

    List<Customer> findAll();

    Customer findById(Long id);
}
