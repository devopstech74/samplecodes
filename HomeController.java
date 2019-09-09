package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
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
	public String getUserHome()
	{
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
