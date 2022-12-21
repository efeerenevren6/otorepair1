package ibmtal.otorepair.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.otorepair.business.services.ServicePartService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.database.ServiceCardDao;
import ibmtal.otorepair.database.ServicePartDao;
import ibmtal.otorepair.dtos.ServicePartAddDto;
import ibmtal.otorepair.entity.ServicePart;

@Service
public class ServicePartManager implements ServicePartService {
	private ServicePartDao servicePartDao;
	private ServiceCardDao serviceCardDao;
	
	@Autowired
	public ServicePartManager(ServicePartDao servicePartDao, ServiceCardDao serviceCardDao) {
		super();
		this.servicePartDao = servicePartDao;
		this.serviceCardDao = serviceCardDao;
	}

	@Override
	public Result<ServicePart> addServicePart(ServicePart servicePart) {
		Result<ServicePart> result=new Result<>();
		result.setData(new ArrayList<ServicePart>(this.servicePartDao.findAll()));
		return result;
	}

	@Override
	public Result<ServicePart> updateServiceCard(ServicePartAddDto servicePartAddDto) {
		Result<ServicePart> result=new Result<>();
		if(this.serviceCardDao.findById(servicePartAddDto.getServiceCard()).isEmpty()) {
			result.newError("OtoPartName", "Araba Parça Adını Boş Geçemezsiniz");
		}
		if(result.isSuccess()) {
			ServicePart servicePart=new ServicePart();
			servicePart.setId(servicePartAddDto.getId());
			servicePart.setQuantity(servicePartAddDto.getQuantity());
			servicePart.setPrice(servicePartAddDto.getPrice());
			servicePart.setServicecard(this.serviceCardDao.findById(servicePartAddDto.getServiceCard()).get());
			this.servicePartDao.save(servicePart);
			result.getData().add(servicePart);
			
		}
		
		return result;
	}
}
