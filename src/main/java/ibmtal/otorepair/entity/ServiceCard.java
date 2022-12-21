package ibmtal.otorepair.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="servicecard")
public class ServiceCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
   private int id;
	@Column(name="servicedate")
   private String serviceDate;
	@ManyToOne()
	@JoinColumn(name = "car")
   private Car car;
	@Column(name="price")
   private int price;
public ServiceCard() {
	super();
}
public ServiceCard(int id, String serviceDate, Car car, int price) {
	super();
	this.id = id;
	this.serviceDate = serviceDate;
	this.car = car;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getServiceDate() {
	return serviceDate;
}
public void setServiceDate(String serviceDate) {
	this.serviceDate = serviceDate;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
}
