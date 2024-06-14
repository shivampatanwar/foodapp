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
import javax.servlet.http.HttpSession;

import dao.Dao;
import dto.Hotel;


@WebServlet(urlPatterns = "/hotel-home", loadOnStartup = 1)
public class HotelHome extends HttpServlet {


	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("hotel-home.jsp").include(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		

		 HttpSession session = req.getSession();
		 session.setAttribute("email", email); 
		 session.setAttribute("password", password);
		
		
		try {
			if (Dao.validateHotelData(email, password)) {
				
				req.getRequestDispatcher("hotel-home.jsp").include(req, resp);
				
			} else {
				req.getRequestDispatcher("hotel-login.jsp").include(req, resp);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		

	}

}
