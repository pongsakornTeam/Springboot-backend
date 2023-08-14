package template.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import template.backend.response.FoodResponse;
import template.backend.service.FoodService;

@RestController
@RequestMapping("main")
public class FoodController {

	@Autowired
	FoodService foodService;
	
	@PostMapping("/food")
	public ResponseEntity<FoodResponse> getFood(){
		FoodResponse response = null; 
		try {
			response = foodService.getFood();
		}catch (Exception e) {
			System.out.println("error");
		}
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/foodDB")
	public ResponseEntity<FoodResponse> getFoodDB(){
		FoodResponse response = null; 
		try {
			response = foodService.getFoodDB();
		}catch (Exception e) {
			System.out.println("error");
		}
		return ResponseEntity.ok(response);
	}
}
