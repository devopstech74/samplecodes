package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
        public String getHome()
	{
		return "home";
	}
	@RequestMapping("product")
	public String getProduct()
	{
		return "Product";
	}
	@RequestMapping("user")
	public String getUser()
	{
		return "User";
	}
}
