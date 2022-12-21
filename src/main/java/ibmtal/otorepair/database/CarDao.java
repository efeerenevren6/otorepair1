package ibmtal.otorepair.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.otorepair.entity.Car;

public interface CarDao extends JpaRepository<Car, Integer> {

}
