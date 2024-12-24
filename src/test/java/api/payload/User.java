package api.payload;

public class User {

	
	int id;
	String username;
	   String firstName;
	   String lastName;
	   String email;
	   String password;
	   String phone;
	   int  userStatus = 0;
	   
	   
   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println(id);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
		System.out.println(username);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println(firstName);
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println(lastName);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		System.out.println(email);
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		System.out.println(password);
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
		System.out.println(phone);
	}

	
	
}
