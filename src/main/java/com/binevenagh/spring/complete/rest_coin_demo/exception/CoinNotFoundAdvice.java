package com.binevenagh.spring.complete.rest_coin_demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * This class provides advice for handling CoinNotFoundException.
 * When a CoinNotFoundException is thrown, it returns a 404 Not Found status.
 *
 * @author danieldevlin
 * @date 02/04/2025
 * @project rest-coin-demo
 */

@ControllerAdvice
public class CoinNotFoundAdvice {

    /**
     * Handles CoinNotFoundException and returns the exception message.
     *
     * @param ex the CoinNotFoundException thrown
     * @return the message of the exception
     */
    @ExceptionHandler(CoinNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String coinNotFoundHandler(CoinNotFoundException ex) {
        return ex.getMessage();
    }
}
