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
@Table(name="cars")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name = "plaka")
	private String plaka;
	@Column(name = "brand")
	private String brand;
	@Column(name = "model")
	private String model;
	@Column(name = "color")
	private String color;
	@ManyToOne()
	@JoinColumn(name="customer")
	private Customer customer;
	public Car() {
		super();
	}
	public Car(int id, String plaka, String brand, String model, String color, Customer customer) {
		super();
		this.id = id;
		this.plaka = plaka;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
