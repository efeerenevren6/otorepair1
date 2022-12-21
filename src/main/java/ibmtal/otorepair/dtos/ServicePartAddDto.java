package ibmtal.otorepair.dtos;

public class ServicePartAddDto {
  private int id;
  private String otoPartName;
  private int quantity;
  private int serviceCard;
  private int price;
public ServicePartAddDto() {
	super();
}
public ServicePartAddDto(int id, String otoPartName, int quantity, int serviceCard, int price) {
	super();
	this.id = id;
	this.otoPartName = otoPartName;
	this.quantity = quantity;
	this.serviceCard = serviceCard;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getOtoPartName() {
	return otoPartName;
}
public void setOtoPartName(String otoPartName) {
	this.otoPartName = otoPartName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getServiceCard() {
	return serviceCard;
}
public void setServiceCard(int serviceCard) {
	this.serviceCard = serviceCard;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
