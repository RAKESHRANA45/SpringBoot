package com.cognizant.rakesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cognizant.rakesh.service.ProductService;

@Controller
@SessionAttributes("name")
public class ProductController {
	@Autowired
	ProductService service;
	
	@RequestMapping(value="/list-products", method = RequestMethod.GET)
	public String showProducts(ModelMap model){
		String name = (String) model.get("name");
		model.put("products", service.retrieveProducts(name));
		return "list-products";
	}
	@RequestMapping(value="/add-product", method = RequestMethod.GET)
	public String showAddTodoPage(ModelMap model){
		return "product";
	}

	@RequestMapping(value="/add-product", method = RequestMethod.POST)
	public String addProducts(ModelMap model, @RequestParam String productName){
		service.addProducts((String) model.get("name"), productName, "Samsung", 1, 20000.00);
		return "redirect:/list-products";
	}
	@RequestMapping(value="/delete-product", method = RequestMethod.GET)
	public String deleteProducts(@RequestParam int productId){
		service.deleteProducts(productId);
		return "redirect:/list-products";
	}
//	@RequestMapping(value="/update-product", method = RequestMethod.GET)
//	public String updateProducts(@RequestParam String productName) {
//		
//	}

}
