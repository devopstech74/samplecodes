package springproject.springbackend;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	@Autowired
   private	Product product;

	public Product getProduct() {
		return product;
	}

	
	public void setProduct(Product product) {
		this.product = product;
	}
	

}
