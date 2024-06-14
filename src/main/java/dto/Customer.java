package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "customerdata")
public class Customer {
	
	@Column(nullable = false, name = "name")
	private String name;
	
	@Id
	@Column(name = "email")
	private String email;
	
	@Column(unique = true, nullable = false, name = "phone")
	private long phone;
	
	@Column(nullable = false, name = "password")
	private String password;
	
	
	private int otp;
	
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Customer(String name, String email, long phone, String password, int otp) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.otp = otp;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public long getPhone() {
		return phone;
	}




	public void setPhone(long phone) {
		this.phone = phone;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public int getOtp() {
		return otp;
	}




	public void setOtp(int otp) {
		this.otp = otp;
	}

	
	


	
	
	
	
	
	
	
	
	

}
