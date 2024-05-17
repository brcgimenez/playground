package br.com.philips.playground.exceptions;

public class AccountLimitException extends RuntimeException {
    public AccountLimitException(String message) {
        super(message);
    }
}
