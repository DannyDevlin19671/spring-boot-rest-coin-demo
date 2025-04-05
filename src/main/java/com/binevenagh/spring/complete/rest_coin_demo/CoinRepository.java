package com.binevenagh.spring.complete.rest_coin_demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for Coin entities.
 * Extends JpaRepository to provide CRUD operations.
 *
 * @author danieldevlin
 * @date 02/04/2025
 * @project rest-coin-demo
 */
interface CoinRepository extends JpaRepository<Coin, Long> {
}
