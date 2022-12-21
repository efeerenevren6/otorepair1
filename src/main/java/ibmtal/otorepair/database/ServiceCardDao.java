package ibmtal.otorepair.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.otorepair.entity.ServiceCard;

public interface ServiceCardDao extends JpaRepository<ServiceCard, Integer> {
  
}
