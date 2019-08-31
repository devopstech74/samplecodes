package ecommerceproject.samplebackend;

public interface ProductDAO {
	public boolean addProduct(Product p);
	public boolean deleteProduct(Product p);
	public boolean updateProduct(Product p);
	public Product findProduct(int id);
	public java.util.List<Product> getAllProducts();

}
