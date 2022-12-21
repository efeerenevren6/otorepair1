package ibmtal.otorepair.business.services;

import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.ServicePartAddDto;
import ibmtal.otorepair.entity.ServicePart;

public interface ServicePartService {
 Result<ServicePart> addServicePart(ServicePart servicePart);
 Result<ServicePart> updateServiceCard(ServicePartAddDto servicePartAddDto);
}
