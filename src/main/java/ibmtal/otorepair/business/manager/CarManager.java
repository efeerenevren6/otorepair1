package ibmtal.otorepair.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.otorepair.business.services.CarService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.database.CarDao;
import ibmtal.otorepair.database.CustomerDao;
import ibmtal.otorepair.dtos.CarAddDto;
import ibmtal.otorepair.entity.Car;
@Service
public class CarManager implements CarService{
	private CarDao carDao;
	private CustomerDao customerDao;
	
	@Autowired
	public CarManager(CarDao carDao, CustomerDao customerDao) {
		super();
		this.carDao = carDao;
		this.customerDao = customerDao;
	}
	@Override
	public Result<Car> addCar(Car car) {
		Result<Car> result=new Result<>();
		result.setData(new ArrayList<Car>(this.carDao.findAll()));
		return result;
	}
	@Override
	public Result<Car> updateCustomer(CarAddDto AddDto) {
		Result<Car> result=new Result<>();
		if(this.customerDao.findById(AddDto.getCustomer()).isEmpty()) {
			result.newError("name", "Araba Adını Boş Geçemezsin");
		}
		if(result.isSuccess()) {
			Car car=new Car();
			car.setId(AddDto.getId());
			car.setPlaka(AddDto.getPlaka());
			car.setBrand(AddDto.getBrand());
			car.setModel(AddDto.getModel());
			car.setColor(AddDto.getColor());
			car.setCustomer(this.customerDao.findById(AddDto.getCustomer()).get());
			this.carDao.save(car);
			result.getData().add(car);
		}
		return result;
	}

}
