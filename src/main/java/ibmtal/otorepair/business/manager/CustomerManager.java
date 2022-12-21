package ibmtal.otorepair.business.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.otorepair.business.services.CustomerService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.database.CustomerDao;
import ibmtal.otorepair.dtos.CustomerAddDto;
import ibmtal.otorepair.entity.Customer;

@Service

public class CustomerManager implements CustomerService{
	private CustomerDao customerDao;
	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao=customerDao;
	}
	@Override
	public Result<Customer> addCustomer(Customer customer) {
		Result<Customer> result=new Result<>();
		if(customer.getName().isEmpty()) {
			result.newError("name", "Boş Geçilemez");
		}
		if(customer.getName().length()>30) {
			result.newError("name", "50 Karakterden fazla Olamaz");
		}
		if(result.isSuccess()) {
			this.customerDao.save(customer);
			result.getData().add(customer);
		}
		return result;
	}
	@Override
	public Result<Customer> updateCustomer(CustomerAddDto customerAddDto) {
		Result<Customer> result=new Result<>();
		Customer customer=new Customer();
		customer=this.customerDao.findById(customerAddDto.getId()).get();
		if(customer==null) {
			result.newError("id", "id numarasına ait bilgiler bulunamadı");
		}
		if(result.isSuccess()==true) {
			customer.setName(customerAddDto.getName());
			customer.setSurname(customerAddDto.getSurname());
			this.customerDao.save(customer);
			result.getData().add(customer);
		}
		return result;
	}
	

}
