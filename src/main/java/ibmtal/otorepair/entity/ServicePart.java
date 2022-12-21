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
@Table(name="customer")
public class ServicePart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@ManyToOne()
	@JoinColumn(name="servicecard")
	private ServiceCard servicecard;
	@Column(name="otopartname")
	private String otopartname;
	@Column(name="quantity")
	private int quantity;
	@Column(name="price")
	private int price;
	public ServicePart() {
		super();
	}
	public ServicePart(int id, ServiceCard servicecard, String otopartname, int quantity, int price) {
		super();
		this.id = id;
		this.servicecard = servicecard;
		this.otopartname = otopartname;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ServiceCard getServicecard() {
		return servicecard;
	}
	public void setServicecard(ServiceCard servicecard) {
		this.servicecard = servicecard;
	}
	public String getOtopartname() {
		return otopartname;
	}
	public void setOtopartname(String otopartname) {
		this.otopartname = otopartname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
