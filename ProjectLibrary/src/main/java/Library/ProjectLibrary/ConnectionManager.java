package Library.ProjectLibrary;
import java.sql.*;
public class ConnectionManager {
	private static Connection connection = null;
	
	private static final String url = "";
	private static final String user = "";
	private static final String pass = "";
	
	private static void makeConnection() {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, user, pass);
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Could not make connection");
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
