package ibmtal.otorepair.dtos;

public class ServiceCardAddDto {
	 private int id;
	 private String serviceDate;
	 private int price;
	 private int car;
	public ServiceCardAddDto() {
		super();
	}
	public ServiceCardAddDto(int id, String serviceDate, int price, int car) {
		super();
		this.id = id;
		this.serviceDate = serviceDate;
		this.price = price;
		this.car = car;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCar() {
		return car;
	}
	public void setCar(int car) {
		this.car = car;
	}
}
