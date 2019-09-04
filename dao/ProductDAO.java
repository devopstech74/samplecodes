package dao;

import ecommerce.com.model.Product;

public interface ProductDAO {
boolean addProduct(Product p);
boolean deleteProduct(Product p);
Product findProduct(int id);
Product updateProduct(Product p);
java.util.List<Product> getAllProducts();
}
