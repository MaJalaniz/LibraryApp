package Library.ProjectLibrary;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AvailableBooksServlet extends HttpServlet {
	private static final long serializationUID = 1L;
	private PatronDao pdao;
	
	public void init(ServletConfig config) throws ServletException{
		pdao = new PatronDao();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<Book> availableBooks = pdao.getAvailableBooks();
		request.setAttribute("availableBooks", availableBooks);
		RequestDispatcher dispatcher = request.getRequestDispatcher("available.jsp");
		dispatcher.forward(request, response);
	}
}
