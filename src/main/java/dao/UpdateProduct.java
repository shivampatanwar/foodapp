package dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Products;

@WebServlet("/update-product")
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int productid = Integer.parseInt(request.getParameter("productid"));
		request.setAttribute("productid", Dao.fetchProduct(productid).getProductid());
		request.setAttribute("productname", Dao.fetchProduct(productid).getProductname());
		request.setAttribute("description", Dao.fetchProduct(productid).getDescription());
		request.setAttribute("price", Dao.fetchProduct(productid).getPrice());

		request.getRequestDispatcher("update-product.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int productid = Integer.parseInt(request.getParameter("productid"));
		String productname = request.getParameter("productname");
		String description = request.getParameter("description");
		double price = Double.parseDouble(request.getParameter("price"));
		String image = request.getParameter("image");

		Products products = Dao.fetchProduct(productid);

		boolean b = Dao.updateProduct(products, productname, description, price, image);
		
		request.setAttribute("productid", Dao.fetchProduct(productid).getProductid());
		request.setAttribute("productname", Dao.fetchProduct(productid).getProductname());
		request.setAttribute("description", Dao.fetchProduct(productid).getDescription());
		request.setAttribute("price", Dao.fetchProduct(productid).getPrice());
		
		request.setAttribute("message", "<h2 style='color: blue'>"+ productname +" Product Updated Successfully.......</h2>");

		request.getRequestDispatcher("update-product.jsp").include(request, response);
	}

}
