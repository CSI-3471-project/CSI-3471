package GUI;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import project.iterationII.Item;
import project.iterationII.Post;
import project.iterationII.Profile;

public class PostInfoPanel extends JPanel {
	Post post;
	
	JPanel user_postKind;
	JLabel userName;
	JLabel postKind;
	
	JPanel itemPanel;
	JLabel itemName;
	
	JTextPane description;
	

	/**
	 * Create the panel.
	 * @return 
	 */
	public void setPostInfoPanel() {
		
		user_postKind = new JPanel();
		
		userName = new JLabel(post.user+"\r\n");
		user_postKind.add(userName);
		userName.setFont(new Font("Calibri", Font.PLAIN, 20));
	
		itemPanel = new JPanel();
		
		description = new JTextPane();
		description.setEditable(false);
		
		System.out.println("in post info panel \tuser name: "+post.user.getUserName());
		description.setText(post.item.getDescription());
		
		itemName = new JLabel(post.item.getName());
		itemPanel.add(itemName);
		itemName.setFont(new Font("Calibri", Font.PLAIN, 20));
		
		
		
	}


	public PostInfoPanel() {
		// TODO Auto-generated constructor stub
	}


	

}
