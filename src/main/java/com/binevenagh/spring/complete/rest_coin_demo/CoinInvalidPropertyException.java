package com.binevenagh.spring.complete.rest_coin_demo;

/**
 * @author danieldevlin
 * @date 03/04/2025
 * @project rest-coin-demo
 */
public class CoinInvalidPropertyException extends RuntimeException {
    /**
     * Constructs a new CoinInvalidPropertyException with the specified detail message.
     *
     * @param property the invalid property of the coin
     */
    public CoinInvalidPropertyException(String property) {
        super("Invalid property: " + property);
    }
}
