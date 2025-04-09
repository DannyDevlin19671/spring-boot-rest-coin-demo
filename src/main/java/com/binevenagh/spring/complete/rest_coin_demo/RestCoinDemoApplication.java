package com.binevenagh.spring.complete.rest_coin_demo;

import com.binevenagh.spring.complete.rest_coin_demo.data.Coin;
import com.binevenagh.spring.complete.rest_coin_demo.data.CoinRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for the RestCoinDemo Spring Boot application.
 */
@SpringBootApplication
public class RestCoinDemoApplication {

    // Logger instance for logging information
    Logger logger = LoggerFactory.getLogger(RestCoinDemoApplication.class);

    /**
     * Main method to run the Spring Boot application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(RestCoinDemoApplication.class, args);
    }

    /**
     * Bean to initialize the database with some predefined Coin entries.
     *
     * @param repository the CoinRepository to save the Coin entries
     * @return a CommandLineRunner to preload the database
     */
    @Bean
    CommandLineRunner initDatabase(CoinRepository repository) {
        return args -> {
            logger.info("Preloading " + repository.save(new Coin(2.0, "Britannia Limited Edition Proof", 0.999, "Gold")));
            logger.info("Preloading " + repository.save(new Coin(2.0, "Britannia Limited Edition Proof", 0.999, "Gold")));
            logger.info("Preloading " + repository.save(new Coin(1.0, "Sovereign 2022", 0.9167, "Gold")));
            logger.info("Preloading " + repository.save(new Coin(31.21, "Queen's Beasts 2021", 0.9999, "Silver")));
            logger.info("Preloading " + repository.save(new Coin(8.0, "Lunar Year of the Tiger 2022", 0.999, "Gold")));
            logger.info("Preloading " + repository.save(new Coin(31.21, "The Great Engravers 2021", 0.999, "Silver")));
        };
    }
}
