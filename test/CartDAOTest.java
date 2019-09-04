package com.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.CartDAO;
import ecommerce.com.backend.SpringConfiguration;
import ecommerce.com.model.Cart;

public class CartDAOTest {
	public static ApplicationContext context;
	@BeforeClass
	public static void setConfiguration()
	{
		context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	}

	@Test
	public void cartdaotest()
	{
		Cart obj=new Cart();
		obj.setEmail("peter@gmail.com");
		obj.setProductid(1);
		obj.setPrice(200);
		java.util.Date dt=new java.util.Date();
	String cartid=	dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+":"+obj.getEmail()+":"+obj.getProductid();
	obj.setCartid(cartid);
	CartDAO dao=(CartDAO)context.getBean("cartDAO");
	assert(dao.addCart(obj));
	}
}
