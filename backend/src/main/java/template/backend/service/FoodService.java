package template.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import template.backend.dao.MENU;
import template.backend.repository.MenuRepository;
import template.backend.response.FoodResponse;

@Service
public class FoodService {
	
	@Autowired
	private MenuRepository menuRepository;
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public FoodResponse getFood() {
		FoodResponse result = null;
		try {
			result = new FoodResponse();
			result.setFood("Hello");
		}catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
	public FoodResponse getFoodDB() {
		FoodResponse result = null;
		try {
			result = new FoodResponse();
			System.out.println("Hello");
			List<MENU> tests = new ArrayList<MENU>();
			tests = menuRepository.findAll();
			for(MENU test : tests) {
				System.out.println(test.getMenu() + " = ");
				result.setFood(test.getMenu());
			}
			
			CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send("active-print", "hello");
//			ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(null);
			future.whenComplete(new BiConsumer() {
				@Override
				public void accept(Object t, Object u) {
					System.out.println("Complete kafka");
					
				}
			});
//			result.setFood(menuRepository.findAll().toString());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+  e);
		}
		return result;
	}
}
