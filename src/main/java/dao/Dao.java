package dao;

import java.io.File;
import java.io.FileInputStream;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import dto.Customer;
import dto.Hotel;
import dto.Products;
import java.util.List;

public class Dao {

	// -------------JPA------------------------------------------
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();
	
	static HttpServletResponse response;

//=======================================================================================================================================================

	// -----------Insert/Add Hotel
	// Data---------------------------------------------------------
	public static void insertHotelData(String name, String email, long phone, String password, String gst) {

		try {

			int otp = new Random().nextInt(1000, 9999);

			Hotel hotel = new Hotel(name, email, phone, password, gst, otp);

			transaction.begin();
			manager.persist(hotel);
			transaction.commit();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

//=========================================================================================================================================

	// -------------Validate Hotel Data--------------------------------------
	public static boolean validateHotelData(String email, String password) {
		boolean status = false;
		try {

			Hotel hotel = manager.find(Hotel.class, email);
			if (email.equals(hotel.getEmail()) && password.equals(hotel.getPassword())) {
				status = true;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

//========================================================================================================================================================

	// -----------Insert/Add Customer
	// Data----------------------------------------------------
	public static void insertCustomerData(String name, String email, long phone, String password) {

		try {

			int otp = new Random().nextInt(1000, 9999);

			Customer customer = new Customer(name, email, phone, password, otp);

			transaction.begin();
			manager.persist(customer);
			transaction.commit();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

//======================================================================================================================================================

	// ----------Validate Customer Data---------------------------------------
	public static boolean validateCustomerData(String email, String password) {
		boolean status = false;
		try {

			Customer customer = manager.find(Customer.class, email);
			if (email.equals(customer.getEmail()) && password.equals(customer.getPassword())) {
				status = true;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

//=======================================================================================================================================================

	// ----------Insert/Add
	// Products---------------------------------------------------------------
	public static boolean addProduct(String productname, String description, double price, String photo) {

		boolean status = false;
		try {

			File file = new File("C:\\Users\\shiva\\Downloads\\" + photo);
			byte[] bFile = new byte[(int) file.length()];
			FileInputStream fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();

			Products products = new Products(productname, description, price, bFile);

			transaction.begin();
			manager.persist(products);
			transaction.commit();

			status = true;

		} catch (Exception e) {
			System.out.println(e);
		}

		return status;

	}

//=======================================================================================================================================================

	// ----------Fetch Products---------------------------------------------------------------
	public static Products fetchProduct(int productid) {

		Products products = null;
		try {

			products = manager.find(Products.class, productid);

		} catch (Exception e) {
			System.out.println(e);
		}

		return products;

	}

// =======================================================================================================================================================

	// ----------Fetch All Products---------------------------------------------------------------
	@SuppressWarnings("unchecked")
	public static List<Products> fetchAllProduct() {

		List<Products> list = null;
		try {

			list  = manager.createQuery("select products from Products products").getResultList();

		} catch (Exception e) {
			System.out.println(e);
		}

		return list;

	}

// =======================================================================================================================================================

	// ----------Update
	// Products---------------------------------------------------------------
	public static boolean updateProduct(Products products, String productname, String description, double price,
			String photo) {
		boolean status = false;
		try {

			File file = new File("C:\\Users\\shiva\\Downloads\\" + photo);
			byte[] bFile = new byte[(int) file.length()];
			FileInputStream fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();

			products.setProductname(productname);
			products.setDescription(description);
			products.setPrice(price);
			products.setImage(bFile);

			transaction.begin();
			manager.merge(products);
			transaction.commit();

			status = true;

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

// =======================================================================================================================================================

	// ----------Delete Products---------------------------------------------------------------
	public static boolean deleteProduct(int productid) {
		boolean status = false;
		try {

			Products products = manager.find(Products.class, productid);

			transaction.begin();
			manager.remove(products);
			transaction.commit();
			
			
			status = true;

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	
	public static void main(String[] args) {
		
	//	Products p = fetchProduct(1);
	//	boolean b = updateProduct(p, "Dosa", "uhygfdsghjkjkgh", 1000, "dosa.jpg");
		

	boolean b1 = addProduct("Dosa", "jhvjnvchcgh", 874132, "dosa.jpg");
	boolean b2 = addProduct("Idly", "jhgjfffhf", 6464565, "dosa.jpg");
	boolean b3 = addProduct("Vada", "rtststsfhd", 89465, "dosa.jpg");
	boolean b4 = addProduct("Meal", "hkhffhfhfh", 87451, "dosa.jpg");
	boolean b5 = addProduct("Pasta", "ytufdxgccxg", 856445, "dosa.jpg");
	boolean b6 = addProduct("Coke", "nmmbmbvvjhhj", 987645, "dosa.jpg");
		
		
//		List<Products> list = fetchAllProduct();
//		
//		for (Products products : list) {
//			System.out.println(products);
//		}
		
//		boolean b = deleteProduct(4);
		
		
		
	}

}
