package br.com.philips.playground.customer.domain;

import br.com.philips.playground.exceptions.AccountLimitException;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class Customer {
    private Long id;
    private String name;
    private BigDecimal balance;

}
