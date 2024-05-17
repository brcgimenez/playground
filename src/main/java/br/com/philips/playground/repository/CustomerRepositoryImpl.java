package br.com.philips.playground.repository;

import br.com.philips.playground.customer.domain.Customer;
import br.com.philips.playground.customer.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    private final List<Customer> inMemoryDB = new ArrayList<>();

    @Override
    public Customer save(Customer customer) {
        Customer newCustomer = new Customer(customer.getId(), customer.getName(), customer.getBalance());
        this.inMemoryDB.add(newCustomer);
        return newCustomer;
    }

    @Override
    public List<Customer> findAll() {
        return this.inMemoryDB;
    }

    @Override
    public Customer findById(Long id) {
        return this.inMemoryDB.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .get();
    }
}
