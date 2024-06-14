package dto;

import java.util.Arrays;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "products")
public class Products {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productid")
	private int productid;
	
	
	@Column(nullable = false, name = "productname")
	private String productname;
	
	@Column(nullable = false, name = "description")
	private String description;
	
	@Column(nullable = false, name = "price")
	private double price;
	
	
	@Lob
	@Column(nullable = false, name = "productimage")
	private byte[] image;


	public Products(String productname, String description, double price, byte[] image) {
		super();
		this.productname = productname;
		this.description = description;
		this.price = price;
		this.image = image;
	}


	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getProductid() {
		return productid;
	}


	public void setProductid(int productid) {
		this.productid = productid;
	}


	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "productid = " + productid + ", productname = " + productname + ", description = " + description
				+ ", price = " + price ;
	}


	
	
	
	
	
	

	
	

}
