package project.iterationII;
public class Driver {
	public Driver() {
		
	}
	LoginPage login = new LoginPage();
	Profile user = new Profile();
	
	/* get user name and  user password*/
	public Profile getUserInfo() {
		return login.getUserInfo();	
	}
	
	
	
	

}
