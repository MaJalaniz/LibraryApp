package Library.ProjectLibrary;

public class Patron {
	
	private String name;
	private String lastName;
	private String username;
	private String password;
	private int frozen;
	
	public Patron(String name, String lastName, String username, String password, int frozen) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.frozen = frozen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFrozen() {
		return frozen;
	}

	public void setFrozen(int frozen) {
		this.frozen = frozen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Patron [name=" + name + ", lastName=" + lastName + ", username=" + username + ", password=" + password
				+ ", frozen=" + frozen + "]";
	}
	

}
