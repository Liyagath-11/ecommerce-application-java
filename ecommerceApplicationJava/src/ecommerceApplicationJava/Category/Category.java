package ecommerceApplicationJava.Category;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Category {

	private int categoryId;
	private String categoryName;
	private Date updatedDate = new Date();
	String lastUpdate = updatedDate.toString();
	private List<String> products = new ArrayList<>();

	public Category(int categoryId) {
		this.categoryId = categoryId;
	}

	public Category() {	}

	public int getCategoryId() {
		return categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

}
