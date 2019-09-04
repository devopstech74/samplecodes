package dao;

import ecommerce.com.model.Category;

public interface CategoryDAO {
	boolean addCategory(Category p);
	boolean deleteCategory(Category p);
	Category findCategory(int id);
	Category updateCategory(Category p);
	java.util.List<Category> getAllCategorys();
}
