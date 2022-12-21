package ibmtal.otorepair.business.services;

import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.CarAddDto;
import ibmtal.otorepair.entity.Car;
public interface CarService {
	Result<Car> addCar(Car car);
	Result<Car> updateCustomer(CarAddDto AddDto);
}
