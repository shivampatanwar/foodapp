package dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int productid = Integer.parseInt(request.getParameter("productid"));
		
		boolean b = Dao.deleteProduct(productid);
		
		request.getRequestDispatcher("hotel-home.jsp").include(request, response);;
	}

	
}
