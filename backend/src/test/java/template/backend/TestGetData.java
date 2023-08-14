package template.backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import template.backend.response.FoodResponse;
import template.backend.service.FoodService;

@SpringBootTest
class TestGetData {
	
	interface TestDate {
		
	}
	
	@Autowired
	private FoodService foodService;

	@Test
	void testGetData() {
		FoodResponse food =  foodService.getFoodDB();
		Assertions.assertNotNull(foodService);
		Assertions.assertEquals("fried_chiken", food.getFood());
	}

}
