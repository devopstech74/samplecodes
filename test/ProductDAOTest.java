package com.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.ProductDAO;
import ecommerce.com.backend.SpringConfiguration;
import ecommerce.com.model.Product;

public class ProductDAOTest {

	public static ApplicationContext context;
	@BeforeClass
	public static void setConfiguration()
	{
		context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	}
	
	@Test 
	public void addProductTest()
	{
		Product p=new Product();
		p.setProductName("Cofee");
		p.setPrice(200);
		p.setQuantity(340);
		p.setCategoryid(1);
		p.setSupplierid(1);
		ProductDAO dao=(ProductDAO)context.getBean("productDAO");
 assertTrue(dao.addProduct(p));		
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
