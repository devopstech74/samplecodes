package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.ProductDAO;
import ecommerce.com.model.Product;

@Controller
public class HomeController {
	@Autowired
	ProductDAO productDAO;
	@RequestMapping("/")
	public String getIndex()
	{
		return "index";
	}
	@RequestMapping("/login")
	public String getLogin()
	{
		 
		return "Login";
	
	}

	@RequestMapping("/adminhome")
	public String getAdminHome()
	{
		return "adminhome";
	}
	@RequestMapping("/userhome")
	public String getUserHome(HttpSession session,Model model)
	{
		String username=SecurityContextHolder.getContext().getAuthentication().getName();
		session.setAttribute("username", username);
		java.util.List<Product> productlist=productDAO.getAllProducts();
		model.addAttribute("productlist", productlist);
		return "userhome";
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session,Model m)
	{
		m.addAttribute("logoutstatus", true);
		m.addAttribute("logoutmessage", "logged out successfully");
		session.invalidate();
		return "Login";
	}
}
