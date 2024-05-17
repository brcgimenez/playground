package br.com.philips.playground.repository;

import br.com.philips.playground.customer.domain.Customer;
import br.com.philips.playground.customer.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

public class CustomerRepositoryTest {

    CustomerRepository repository = new CustomerRepositoryImpl();

    @Test
    public void shouldSaveNewCustomerWithSuccess() {
        Customer customer = new Customer(1L, "Bruno", BigDecimal.TEN);

        Customer customerSaved = repository.save(customer);

        Assertions.assertNotNull(customerSaved);
        Assertions.assertEquals(1L, customerSaved.getId());
        Assertions.assertEquals("Bruno", customerSaved.getName());
        Assertions.assertEquals(BigDecimal.TEN, customerSaved.getBalance());
    }

    @Test
    public void shouldFindAllCustomerWithSuccess() {
        Customer customer1 = new Customer(1L, "Bruno", BigDecimal.TEN);
        Customer customer2 = new Customer(2L, "João", BigDecimal.TEN);

        repository.save(customer1);
        repository.save(customer2);

        List<Customer> customers = repository.findAll();

        Assertions.assertNotNull(customers);
        Assertions.assertEquals(2, customers.size());
        Assertions.assertEquals(customers.get(0).getName(), customer1.getName());
        Assertions.assertEquals(customers.get(1).getName(), customer2.getName());
    }

    @Test
    public void shouldFindCustomerByIdWithSuccess() {
        Customer customer1 = new Customer(1L, "Bruno", BigDecimal.TEN);
        Customer customer2 = new Customer(2L, "João", BigDecimal.TEN);

        repository.save(customer1);
        repository.save(customer2);

        Customer customerSaved = repository.findById(2L);

        Assertions.assertNotNull(customerSaved);
        Assertions.assertEquals(customerSaved.getName(), customer2.getName());
    }
}
