package template.backend.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FoodResponse {
	private String food;

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
}
