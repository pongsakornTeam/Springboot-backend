package template.backend.dao;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity(name="menu")
@Getter
@Setter
public class MENU {
	
	@Id
	@Column(name = "menu_id")
	private long menuId;
	
	@Column(name = "menu")
	private String menu;
	
	@Column(name = "ingredients")
	private String ingredients;

	public long getMenuId() {
		return menuId;
	}

	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
}
