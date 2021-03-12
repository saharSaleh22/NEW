package cucumber;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

public class Admin {
	private String name,password;
	public boolean loginAdmin;

	public boolean isLoginAdmin() {
		return loginAdmin;
	}
	public void setLoginAdmin(boolean loginAdmin) {
		this.loginAdmin = loginAdmin;
	}
	public Admin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



}
