package GUI;

import javax.swing.JPanel;

import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

import project.iterationII.Post;

import javax.swing.JButton;
import javax.swing.JLabel;

public class InfoPanel extends JPanel {

	ArrayList<Post> posts;
	ArrayList<PostInfoPanel> postInfoPanels;
	/**
	 * Create the panel.
	 */
	public InfoPanel(ArrayList<Post> p) {
		posts=p;
		
		postInfoPanels=new ArrayList<PostInfoPanel>();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		for( Post post :posts) {
			PostInfoPanel postInfoPanel=post.setPostInfoPanel();
			postInfoPanel.setSize(200,50);
			postInfoPanels.add(postInfoPanel);
			this.add(postInfoPanel);
			
		}
		
		
		
		
	}

}
