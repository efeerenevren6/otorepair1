package ibmtal.otorepair.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.otorepair.business.services.ServicePartService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.ServicePartAddDto;
import ibmtal.otorepair.entity.ServicePart;

@RestController
@RequestMapping("/api/servicepart")
public class ServicePartController {
  private ServicePartService servicePartService;
 @Autowired
public ServicePartController(ServicePartService servicePartService) {
	super();
	this.servicePartService = servicePartService;
}
  @PostMapping("/addservicecard")
  @GetMapping
  public Result<ServicePart>addServicePartApi(@RequestBody ServicePartAddDto servicePartAddDto){
	  return this.servicePartService.updateServiceCard(servicePartAddDto);
  }
}
