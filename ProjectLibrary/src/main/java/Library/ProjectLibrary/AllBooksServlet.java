package Library.ProjectLibrary;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AllBooksServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		private PatronDao pdao;
		
	public void init(ServletConfig config) throws ServletException{
		pdao = new PatronDao();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Book> allBooks = pdao.getAllBooks();
		request.setAttribute("allBooks", allBooks);
		RequestDispatcher dispatcher = request.getRequestDispatcher("allBooks.jsp");
			dispatcher.forward(request,  response);
	}
	
	

}
