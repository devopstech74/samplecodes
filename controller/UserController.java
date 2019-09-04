package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.UserDAO;
import ecommerce.com.model.User;

@Controller
public class UserController {
	@Autowired
	UserDAO userDAO;
	@ModelAttribute("user")
	public User getUser()
	{
		return new User();
	}
	@RequestMapping(value="adduser",method=RequestMethod.POST)
	public String addUser(User user,ModelAttribute userobj)
	{
		if(userDAO.addUser(user))
		{
			return "register";
		}
		else
		{
			return "error";
		}
	
	}

}
