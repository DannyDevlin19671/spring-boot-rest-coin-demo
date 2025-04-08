package com.binevenagh.spring.complete.rest_coin_demo;

//import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Controller for handling requests related to coins.
 * Provides endpoints for CRUD operations on coins.
 */
@RestController
public class CoinController {
    private final CoinRepository repository;

    /**
     * Constructor for CoinController.
     *
     * @param repository the repository to interact with coin data
     */
    CoinController(CoinRepository repository) {
        this.repository = repository;
    }

    /**
     * Get all coins.
     *
     * @return a list of all coins
     */
    //@Operation(summary = "Get all coins", description = "Retrieve a list of all coins")
    @GetMapping("/coins")
    List<Coin> all() {
        return repository.findAll();
    }

    /**
     * Create a new coin.
     *
     * @param newCoin the coin to be created
     * @return the created coin
     */
    //@Operation(summary = "Create a new coin", description = "Create a new coin")
    @PostMapping(value = "/coins", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Coin newCoin(@RequestBody Coin newCoin) {
        return repository.save(newCoin);
    }

    /**
     * Get a coin by its ID.
     *
     * @param id the ID of the coin
     * @return the coin with the specified ID
     * @throws CoinNotFoundException if the coin is not found
     */
    //@Operation(summary = "Get a coin by ID", description = "Retrieve a coin by its ID")
    @GetMapping("/coins/{id}")
    Coin one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new CoinNotFoundException(id));
    }

    /**
     * Replace a coin with a new one.
     *
     * @param newCoin the new coin data
     * @param id the ID of the coin to be replaced
     * @return the updated coin
     */
    //@Operation(summary = "Replace a coin", description = "Replace a coin with new data")
    @PutMapping("/coins/{id}")
    Coin replaceCoin(@RequestBody Coin newCoin, @PathVariable Long id) {
        return repository.findById(id)
                .map(coin -> {
                    coin.setWeight(newCoin.getWeight());
                    coin.setDescription(newCoin.getDescription());
                    coin.setFineness(newCoin.getFineness());
                    coin.setMetal(newCoin.getMetal());
                    return repository.save(coin);
                })
                .orElseGet(() -> repository.save(newCoin));
    }

    /**
     * Delete a coin by its ID.
     *
     * @param id the ID of the coin to be deleted
     */
    //@Operation(summary = "Delete a coin", description = "Delete a coin by its ID")
    @DeleteMapping("/coins/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteCoin(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
