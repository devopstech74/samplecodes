package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.CartDAO;
import dao.ProductDAO;
import ecommerce.com.model.Cart;
import ecommerce.com.model.Product;

@Controller
public class CartController {
	@Autowired
	CartDAO cartDAO;

	   @RequestMapping(value="addtocart", method=RequestMethod.POST)
	   public String addtocart(Cart cart)
	   {
		    java.util.Date dt=new java.util.Date();
		   String cartid=	dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+cart.getEmail();
			cart.setCartid(cartid);
			cartDAO.addCart(cart);
			return "redirect:userhome";
	   }
	   @RequestMapping("/cart")
	   public String viewCart(HttpSession session,Model model)
	   {
		   String username=(String)session.getAttribute("username");
		   java.util.Date dt=new java.util.Date();
		   String cartid=	dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+username+"/";
				   java.util.List<Cart> cartlist=cartDAO.getAllCarts(cartid);
				   float sum=0;
				   for(Cart c:cartlist)
				   {
					   sum=sum+c.getPrice();
				   }
	           model.addAttribute("cartlist",cartlist);
		     model.addAttribute("carttotal",sum);
		   return "cart";
	   }
	   @RequestMapping("/deletecart")
	   public String delteCart(HttpServletRequest request)
	   {
		   int id=Integer.parseInt(request.getParameter("id"));
		   Cart cart=cartDAO.findCart(id);
		   cartDAO.deleteCart(cart);
		    return "redirect:cart";
	   }
}
