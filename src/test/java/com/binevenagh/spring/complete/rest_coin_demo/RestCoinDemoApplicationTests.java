package com.binevenagh.spring.complete.rest_coin_demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RestCoinDemoApplicationTests {
//	private static final Logger logger = LoggerFactory.getLogger(RestCoinDemoApplicationTests.class);
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Test
//	void shouldReturnAllCoins() throws Exception{
//		logger.info("🔍 Checking if all coins are returned");
//		mockMvc.perform(get("/coins"))
//				.andExpect(status().isOk())
//				.andExpect(jsonPath("$", hasSize(6)));
//		logger.info("✅ All coins returned successfully");
//	}
//
//	@Test
//	void shouldReturnCoinById() throws Exception {
//		logger.info("🔍 Checking if coin with ID 1 is returned");
//
//		mockMvc.perform(get("/coins/1"))
//				.andExpect(status().isOk())
//				.andExpect(jsonPath("$.id", is(1)))
//				.andExpect(jsonPath("$.description", is("Britannia Limited Edition Proof")));
//		logger.info("✅ Coin with ID 1 returned successfully");
//	}
//
//	@Test
//	void shouldReturnNotFoundForInvalidId() throws Exception {
//		logger.info("🔍 Checking if 404 is returned for invalid ID");
//		mockMvc.perform(get("/coins/999"))
//				.andExpect(status().isNotFound());
//		logger.info("✅ 404 returned for invalid ID");
//	}
//
//	@Test
//	void shouldReturnNotFoundForInvalidEndpoint() throws Exception {
//		logger.info("🔍 Checking if 404 is returned for invalid endpoint");
//		mockMvc.perform(get("/invalid-endpoint"))
//				.andExpect(status().isNotFound());
//		logger.info("✅ 404 returned for invalid endpoint");
//	}
//
//	@Test
//	void shouldReturnBadRequestForInvalidIdFormat() throws Exception {
//		logger.info("🔍 Checking if 400 is returned for invalid ID format");
//		mockMvc.perform(get("/coins/invalid-id"))
//				.andExpect(status().isBadRequest());
//		logger.info("✅ 400 returned for invalid ID format");
//	}
//
//	@Test
//	void shouldAllowCreationOfNewCoins() throws Exception {
//		logger.info("🔍 Checking if new coins can be created");
//		String newCoinJson = "{ \"weight\": 1.0, \"description\": \"Test Coin\", \"fineness\": 0.999, \"metal\": \"Gold\" }";
//
//		mockMvc.perform(post("/coins")
//						.contentType("application/json")
//						.content(newCoinJson))
//				.andExpect(jsonPath("$.description", is("Test Coin")));
//		logger.info("✅ New coin created successfully");
//	}
//
//	@Test
//	void shouldReturn201ForNewCoinCreation() throws Exception {
//		logger.info("🔍 Checking if 201 is returned for new coin creation");
//		String newCoinJson = "{ \"weight\": 1.0, \"description\": \"Test Coin\", \"fineness\": 0.999, \"metal\": \"Gold\" }";
//
//		mockMvc.perform(post("/coins")
//						.contentType("application/json")
//						.content(newCoinJson))
//				.andExpect(status().isCreated());
//		logger.info("✅ 201 returned for new coin creation");
//	}
//
//	@Test
//	void shouldReturn400ForInvalidCoinData() throws Exception {
//		logger.info("🔍 Checking if 400 is returned for invalid coin data");
//		String invalidCoinJson = "{ \"weight\": -1.0, \"description\": \"Invalid Coin\", \"fineness\": 0.999, \"metal\": \"Gold\" }";
//
//		mockMvc.perform(post("/coins")
//						.contentType("application/json")
//						.content(invalidCoinJson))
//				.andExpect(status().isBadRequest());
//		logger.info("✅ 400 returned for invalid coin data");
//	}
//
//	@Test
//	void testUpdateCoin() throws Exception {
//		logger.info("🔍 Checking if coin with ID 1 can be updated");
//		String updatedCoinJson = "{ \"weight\": 2.0, \"description\": \"Updated Coin\", \"fineness\": 0.999, \"metal\": \"Silver\" }";
//
//		mockMvc.perform(put("/coins/1")
//						.contentType("application/json")
//						.content(updatedCoinJson))
//				.andExpect(status().isOk())
//				.andExpect(jsonPath("$.description", is("Updated Coin")));
//		logger.info("✅ Coin with ID 1 updated successfully");
//	}
//
//	@Test
//	void testDeleteCoin() throws Exception {
//		logger.info("🔍 Checking if coin with ID 1 can be deleted");
//		mockMvc.perform(delete("/coins/1"))
//				.andExpect(status().isNoContent());
//	}
}
