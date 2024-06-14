package controller;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Products;

@WebServlet("/add-product")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("add-product.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String productname = req.getParameter("productname");
		String description = req.getParameter("description");
		double price = Double.parseDouble(req.getParameter("price"));
		String photo = req.getParameter("image");

		if(Dao.addProduct(productname, description, price, photo)) {
			req.setAttribute("message", "<h2 style='color: blue'>"+ productname +" Product Added Successfully.......</h2>");
			req.getRequestDispatcher("add-product.jsp").include(req, resp);
		}else {
			req.setAttribute("message", "<h2 style='color: blue'> Error.......</h2>");
			req.getRequestDispatcher("add-product.jsp").include(req, resp);
		}
	}

}
