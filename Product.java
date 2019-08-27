package springproject.springbackend;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="ProductDetails")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int productid;
	private String productName;
	private int categoryId;
	private int supplierId;
	@Column(name="productprice")
	private float price;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
 public String toString()
 {
	 return "Product object";
 }
}
