package controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Customer;
import dto.Hotel;


@WebServlet("/customer-home")
public class CustomerHome extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("customer-home.jsp").include(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Customer c = manager.find(Customer.class, email );

		
		
		try {
			if (email.equals(c.getEmail()) && password.equals(c.getPassword())) {
				
				req.getRequestDispatcher("customer-home.jsp").include(req, resp);
				
			} else {
				req.getRequestDispatcher("customer-login.jsp").include(req, resp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

	}

}
