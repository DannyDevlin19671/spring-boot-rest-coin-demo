package com.binevenagh.spring.complete.rest_coin_demo.exception;

/**
 * Exception thrown when a coin with the specified ID is not found.
 *
 * @author danieldevlin
 * @date 02/04/2025
 * @project rest-coin-demo
 */
public class CoinNotFoundException extends RuntimeException {

    /**
     * Constructs a new CoinNotFoundException with the specified detail message.
     *
     * @param id the ID of the coin that could not be found
     */
    public CoinNotFoundException(Long id) {
        super("Could not find coin " + id);
    }
}
