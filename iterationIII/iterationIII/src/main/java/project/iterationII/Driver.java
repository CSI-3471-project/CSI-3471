package project.iterationII;

import java.awt.EventQueue;
import java.util.ArrayList;

import GUI.LoginPage;
import GUI.mainPage;

public class Driver {
	
	LoginPage login;
	Profile user;
	mainPage window;
	ArrayList<Post> p;
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
		p=new ArrayList<Post>();
		
		/*testing post*/
		SellPost sp=new SellPost(u,"textbook",10.0,"brand new software textbook");
		p.add(sp);
		
		window = new mainPage(user,p);
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
