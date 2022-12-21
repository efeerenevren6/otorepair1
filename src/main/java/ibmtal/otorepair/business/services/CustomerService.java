package ibmtal.otorepair.business.services;

import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.CustomerAddDto;
import ibmtal.otorepair.entity.Customer;

public interface CustomerService {
	Result<Customer> addCustomer(Customer customer);
	Result<Customer> updateCustomer(CustomerAddDto customerAddDto);
}
