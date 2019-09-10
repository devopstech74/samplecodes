package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.SupplierDAO;
import ecommerce.com.model.Supplier;

@Controller
public class SupplierController {
@Autowired
SupplierDAO supplierDAO;
	@ModelAttribute("addsupplier")
	public Supplier getSupplier()
	{
		return new Supplier();
	}
	@RequestMapping("/supplier")
	public String getSupplierPage()
	{
		return "Supplier";
	}
	@RequestMapping(value="/addsupplier",method=RequestMethod.POST)
	public String addSupplier(Supplier supplier)
	{
		supplierDAO.addSupplier(supplier);
		return "redirect:supplier";
	}

}
