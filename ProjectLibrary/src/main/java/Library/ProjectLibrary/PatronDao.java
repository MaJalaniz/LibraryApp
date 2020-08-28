package Library.ProjectLibrary;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PatronDao {
	public static final Connection connection = ConnectionManager.getConnection();
	private static final Patron pdao = null;
	
	public boolean checkoutBook(String isbn) {
		return false;
	}
	
	public boolean returnBook(String isbn) {
		return false;
	}
	
	public boolean createAccount() {
		return false;
	}
	
	public Patron login(String username, String password) {
		return pdao;
	}
	
	public boolean updateUsername(String newUsername) {
		return false;
	}
	
	public boolean updatePassword(String newPassword) {
		return false;
	}
	
	public List<Book> getAllBooks(){
		List<Book> allBooks = new ArrayList<>();
		
		try {
			PreparedStatement ps = connection.prepareStatement("select * from book");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Book book = new Book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), LocalDate.parse(rs.getString(5)));
				allBooks.add(book);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return allBooks;
	}
	
	public List<Book> getAvailableBooks(){
		List<Book> availableBooks = new ArrayList<>();
		
		try {
			PreparedStatement ps = connection.prepareStatement("select * from book where rented = 0");
			ResultSet rs = ps.executeQuery();
			while(rs.next)
		}
	}
}
