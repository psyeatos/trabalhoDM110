package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PARTNER")
public class Partner implements Serializable{

	public Partner() {}
	
	@partnerCode
	private int partnerCode;
	private String name;
  private int phone;
	private String email;
	private int rating;

	public int getPartnerCode() {
		return partnerCode;
	}
	public void setPartnerCode(int partnerCode) {
		this.partnerCode = partnerCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
  public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}	
}