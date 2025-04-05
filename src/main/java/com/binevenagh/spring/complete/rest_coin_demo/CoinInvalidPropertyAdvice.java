package com.binevenagh.spring.complete.rest_coin_demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author danieldevlin
 * @date 03/04/2025
 * @project rest-coin-demo
 */

@ControllerAdvice
public class CoinInvalidPropertyAdvice {
    /**
     * Handles CoinInvalidPropertyException and returns the exception message.
     *
     * @param ex the CoinInvalidPropertyException thrown
     * @return the message of the exception
     */
    @ExceptionHandler(CoinInvalidPropertyException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String coinInvalidPropertyHandler(CoinInvalidPropertyException ex) {
        return ex.getMessage();
    }
}
