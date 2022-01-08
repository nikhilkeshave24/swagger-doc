package com.swagger.documentation.swaggerdoc.dao;
import org.springframework.data.repository.CrudRepository;

import com.swagger.documentation.swaggerdoc.model.CustomerModel;  
public interface CustomerRepository extends CrudRepository<CustomerModel, String> {

}
