package ibmtal.otorepair.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.otorepair.business.services.ServiceCardService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.ServiceCardAddDto;
import ibmtal.otorepair.entity.ServiceCard;
@RestController
@RequestMapping("/api/servicecard")
public class ServiceCardController {
  private ServiceCardService serviceCardService;
 @Autowired
public ServiceCardController(ServiceCardService serviceCardService) {
	super();
	this.serviceCardService = serviceCardService;
}
  @PostMapping("/addcar")
  @GetMapping
  public Result<ServiceCard>addServiceCardApi(@RequestBody ServiceCardAddDto serviceCardAddDto){
	  return this.serviceCardService.updateCar(serviceCardAddDto);
  }
    
}
