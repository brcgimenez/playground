package br.com.philips.playground.customer.services;

import br.com.philips.playground.customer.domain.Customer;
import br.com.philips.playground.customer.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    public Customer save(Customer customer) {
        return this.customerRepository.save(customer);
    }
}
