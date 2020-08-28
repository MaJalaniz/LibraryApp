package Library.ProjectLibrary;
import java.sql.*;

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
	
	
}
