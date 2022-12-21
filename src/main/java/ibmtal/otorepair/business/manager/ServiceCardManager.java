package ibmtal.otorepair.business.manager;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import ibmtal.otorepair.business.services.ServiceCardService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.database.CarDao;
import ibmtal.otorepair.database.ServiceCardDao;
import ibmtal.otorepair.dtos.ServiceCardAddDto;
import ibmtal.otorepair.entity.ServiceCard;

@Service
public class ServiceCardManager implements ServiceCardService {
 private ServiceCardDao serviceCardDao;
 private CarDao carDao;
public ServiceCardManager(ServiceCardDao serviceCardDao, CarDao carDao) {
	super();
	this.serviceCardDao = serviceCardDao;
	this.carDao = carDao;
}
@Override
public Result<ServiceCard> addServiceCard(ServiceCard serviceCard) {
	Result<ServiceCard> result=new Result<>();
	result.setData(new ArrayList<ServiceCard>(this.serviceCardDao.findAll()));
	return null;
}
@Override
public Result<ServiceCard> updateCar(ServiceCardAddDto serviceCardAddDto) {
	Result<ServiceCard> result=new Result<>();
	if(this.carDao.findById(serviceCardAddDto.getCar()).isEmpty()) {
		result.newError("serviceDate", "Servis Tarihi Boş Geçilemez");
	}
	if(result.isSuccess()) {
		ServiceCard serviceCard=new ServiceCard();
		serviceCard.setId(serviceCardAddDto.getId());
		serviceCard.setPrice(serviceCardAddDto.getPrice());
		serviceCard.setCar(this.carDao.findById(serviceCardAddDto.getCar()).get());
		this.serviceCardDao.save(serviceCard);
		result.getData().add(serviceCard);
	}
	return result;
}

}
