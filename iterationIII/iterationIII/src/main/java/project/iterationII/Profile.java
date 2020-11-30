package project.iterationII;

import java.util.List;

public class Profile {
	
	private String userName;
	private String password;
	private List<Comment> allComments;
	public Profile() {
		
	}
	
	public String getPassaword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
