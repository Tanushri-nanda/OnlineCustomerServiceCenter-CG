package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Customer;
import com.capgemini.service.CustomerService;

@RestController
@RequestMapping("/cc")
public class CustomerController {
	
	@Autowired(required=true)
	CustomerService service;
	
	@RequestMapping(value="/customer",method=RequestMethod.GET)
	public List<Customer> getAllCustomer()
	{
		return  ((CustomerController) service).getAllCustomer();
	}
	
	@RequestMapping(value="/customer/{id}",method=RequestMethod.GET)
	public Customer getCustomerById(@PathVariable long id)
	{
		return ((CustomerController) service).getCustomerById(id);
	}
	
	
	@RequestMapping(value="/addcustomer",method=RequestMethod.POST)
	public Customer addCustomer( @RequestBody  Customer e)
	{
		return ((CustomerController) service).addCustomer(e);
		
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public Customer updateCustomer(@PathVariable long id,@RequestBody Customer e)
	{
		return ((CustomerController) service).updateCustomer(id,e);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void  deleteCustomer(@PathVariable long id)
	{
		((CustomerController) service).deleteCustomer(id);
	}
}