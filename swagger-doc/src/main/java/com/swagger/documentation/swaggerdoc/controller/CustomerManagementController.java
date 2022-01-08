package com.swagger.documentation.swaggerdoc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.documentation.swaggerdoc.dao.CustomerRepository;
import com.swagger.documentation.swaggerdoc.model.CustomerModel;

@RestController
@RequestMapping("customer-management")
public class CustomerManagementController {

	@Autowired
	CustomerRepository customerRepository;

	@PostMapping("/customer")
	public ResponseEntity<CustomerModel> createCustomer(@RequestBody CustomerModel customerModel) {
		customerModel = customerRepository.save(customerModel);
		return new ResponseEntity<CustomerModel>(customerModel, HttpStatus.OK);
	}

	@GetMapping({ "/customer", "/customer/{customerId}" })
	public ResponseEntity<List<CustomerModel>> getCustomer(
			@PathVariable(value = "customerId", required = false) String customerId) {
		List<CustomerModel> customerModels = new ArrayList<CustomerModel>();
		if (null != customerId && !customerId.trim().isEmpty()) {
			Optional<CustomerModel> customerModel = customerRepository.findById(customerId);
			if (customerModel.isPresent()) {
				customerModels.add(customerModel.get());
			}
		} else {
			customerModels = (List<CustomerModel>) customerRepository.findAll();
		}
		return new ResponseEntity<List<CustomerModel>>(customerModels, HttpStatus.OK);
	}

}
