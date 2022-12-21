package ibmtal.otorepair.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.otorepair.entity.ServicePart;

public interface ServicePartDao extends JpaRepository<ServicePart, Integer> {

}
