package project.iterationII;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.Font;

public class NotifPage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public NotifPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.add(panel_2);
		
		JLabel lblAaaaaaaaaaaaaaaa = new JLabel("A product you've requested is ready to buy!");
		panel_2.add(lblAaaaaaaaaaaaaaaa);
		lblAaaaaaaaaaaaaaaa.setFont(new Font("Calibri", Font.PLAIN, 15));
		
		JButton btnClose_1 = new JButton("Close");
		panel_2.add(btnClose_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JLabel lblAhsdfjkagguihbfgsj = new JLabel("Someone wants to buy your Ninja Blender!");
		lblAhsdfjkagguihbfgsj.setFont(new Font("Calibri", Font.PLAIN, 15));
		panel_1.add(lblAhsdfjkagguihbfgsj);
		
		JButton btnClose = new JButton("Close");
		panel_1.add(btnClose);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.add(panel_3);
		
		JLabel lblTheBiddingPrice = new JLabel("The bidding price for your LG TV just rose to $250 !");
		lblTheBiddingPrice.setFont(new Font("Calibri", Font.PLAIN, 15));
		panel_3.add(lblTheBiddingPrice);
		
		JButton btnClose_2 = new JButton("Close");
		panel_3.add(btnClose_2);
		
		JScrollBar scrollBar = new JScrollBar();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
						.addComponent(scrollBar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
					.addContainerGap())
		);
		setLayout(groupLayout);
	}
	
	static void createAndShowGUI() {
		JFrame frame = new JFrame("Notifications");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //Add contents to the window.
        frame.getContentPane().add(new NotifPage());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}
}
