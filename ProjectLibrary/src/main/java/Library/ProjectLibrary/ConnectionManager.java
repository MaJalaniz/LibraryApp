package Library.ProjectLibrary;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class ConnectionManager {
	private static Connection connection = null;
	
	private static void makeConnection() {
		Properties props = new Properties();
		
		try {
			props.load(new FileInputStream("Resources/config.properties"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		 String url = props.getProperty("url");
		 String user = props.getProperty("user");
		 String pass = props.getProperty("pass");
		 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, user, pass);
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Could not make connection");
			}
		
	}
	private static Connection getConnection() {
		if(connection == null) {
			makeConnection();
		}
		return connection;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
