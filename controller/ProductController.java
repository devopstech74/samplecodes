package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.ProductDAO;
import ecommerce.com.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO productDAO;
	@RequestMapping(value="addproduct",method=RequestMethod.POST)
	public String addProduct(HttpServletRequest request)
	{
	
		String prname=request.getParameter("prname");
		String price=request.getParameter("price");
		String quantity=request.getParameter("quantity");
		String description=request.getParameter("description");
		float pr=Float.parseFloat(price);
		int q=Integer.parseInt(quantity);
		Product product=new Product();
		product.setPrice(pr);
		product.setQuantity(q);
		product.setProductName(prname);
		product.setCategoryid(1);
		product.setSupplierid(1);
		product.setDescription(description);
		if(productDAO.addProduct(product))
		{
			return "Product";
		}
		else
		{
			return "error";
		}
		
		
		
	}

}
