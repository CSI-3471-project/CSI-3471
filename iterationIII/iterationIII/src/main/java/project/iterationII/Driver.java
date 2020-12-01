package project.iterationII;

import java.awt.EventQueue;

public class Driver {
	
	LoginPage login;
	Profile user;
	mainPage window;
	public Driver() {
		login=new LoginPage(this);
		user = new Profile();
	}
	
	
	/* get user name and  user password*/
	public Profile getUserInfo() {
		return login.getUserInfo();	
	}
	
	/*display the main window*/
	public void displayMainWindow(Profile u) {
		user=u;
		window = new mainPage(user);
		window.frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Driver driver=new Driver();
					driver.login.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

}
