package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import project.iterationII.NotifPage;
import project.iterationII.Profile;
import project.iterationII.UserPanel;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridLayout;
import javax.swing.JScrollBar;


public class mainPage implements ActionListener {

	public JFrame frame;
	private JMenuBar menuBar;
	private JPanel panel;
	private JPanel info_Panel;
	static JFrame frameForUser;
	Profile user;
	UserPanel userPanel;
	/**
	 * Create the application.
	 */
	public mainPage(Profile u) {
		user=u;
		initialize();
	}
	public JFrame setJFrame(JFrame j) {
		frameForUser = j;
		return frame;	
	}
	public JFrame getJFrame() {
		return frameForUser;	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 659, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Menu bar as the notification
		menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 0, 0));
		menuBar.setToolTipText("");
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		JMenu menu;
		JMenuItem menuItem;
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		frame.setJMenuBar(menuBar);

		JPanel panel_4 = new JPanel();
		menuBar.add(panel_4);
		menu = new JMenu("+");
		menuBar.add(menu);
		menuItem = new JMenuItem("Need Item Post");
		menu.add(menuItem);
		menuItem.setActionCommand("Need Item Post");

		menuItem.addActionListener(this);

		menuItem = new JMenuItem("Sell Item Post");
		menu.add(menuItem);
		menuItem.setActionCommand("Sell Item Post");
		menuItem.addActionListener(this);

		menuItem = new JMenuItem("Bid Item Post");
		menu.add(menuItem);
		menuItem.setActionCommand("Bid Item Post");
		menuItem.addActionListener(this);

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(panel, gbc_panel);

		userPanel=new UserPanel(user);
		userPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));

		JPanel info_Panel = new JPanel();
		info_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(2)
					.addComponent(userPanel, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(info_Panel, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(userPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(info_Panel, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
					.addContainerGap())
		);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));

		JScrollBar scrollBar = new JScrollBar();

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));

		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));

		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
				JPanel panel_3_4 = new JPanel();
				panel_3_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GroupLayout gl_info_Panel = new GroupLayout(info_Panel);
		gl_info_Panel.setHorizontalGroup(
			gl_info_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_info_Panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_info_Panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3_4, GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
						.addComponent(panel_3_3, GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
						.addComponent(panel_3_2, GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
						.addComponent(panel_3_1, GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_info_Panel.setVerticalGroup(
			gl_info_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_info_Panel.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_info_Panel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
						.addGroup(gl_info_Panel.createSequentialGroup()
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3_2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3_3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3_4, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);

		JButton btnNewButton_3 = new JButton("U");

		JLabel lblNewLabel_4 = new JLabel("need Item: \r\n");

		JLabel lblNewLabel_5 = new JLabel("description\r\n");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup().addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup().addComponent(btnNewButton_3)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblNewLabel_4))
						.addGroup(gl_panel_3.createSequentialGroup().addContainerGap().addComponent(lblNewLabel_5)))
						.addContainerGap(239, Short.MAX_VALUE)));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton_3)
								.addComponent(lblNewLabel_4))
						.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE).addComponent(lblNewLabel_5)
						.addContainerGap()));
		panel_3.setLayout(gl_panel_3);
		info_Panel.setLayout(gl_info_Panel);

//		JButton btnNewButton = new JButton("Chat");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		this.setJFrame(frame);
		

//		JLabel lblNewLabel = new JLabel("User");
//		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
//
//		JLabel lblNewLabel_1 = new JLabel("credit : 4.5");
//		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 20));
//
//		JLabel lblNewLabel_1_1 = new JLabel("trade : 9999");
//		lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 20));
//
//		JButton btnNewButton_1 = new JButton("like");
//
//		JLabel lblNewLabel_2 = new JLabel("99");
//
//		JLabel lblNewLabel_3 = new JLabel("New label");
//		lblNewLabel_3.setIcon(
//				new ImageIcon("D:\\CS3471\\Bear Trade Platform\\CSI-3471\\iterationII\\default-user-image.png"));

//		JButton btnNewButton_2 = new JButton("N");
//		btnNewButton_2.setActionCommand("N");
//		btnNewButton_2.addActionListener(this);
		//GroupLayout gl_panel_1 = new GroupLayout(panel_1);
//		gl_panel_1.setHorizontalGroup(
//			gl_panel_1.createParallelGroup(Alignment.TRAILING)
//				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
//					.addGap(40)
//					.addComponent(btnNewButton)
//					.addContainerGap(151, Short.MAX_VALUE))
//				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
//					.addGap(19)
//					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
//						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
//						.addGroup(gl_panel_1.createSequentialGroup()
//							.addComponent(btnNewButton_1)
//							.addGap(18)
//							.addComponent(lblNewLabel_2)))
//					.addContainerGap(129, Short.MAX_VALUE))
//				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
//					.addGap(27)
//					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
//					.addContainerGap(121, Short.MAX_VALUE))
//				.addGroup(gl_panel_1.createSequentialGroup()
//					.addContainerGap(137, Short.MAX_VALUE)
//					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
//					.addGap(26))
//				.addGroup(gl_panel_1.createSequentialGroup()
//					.addContainerGap(123, Short.MAX_VALUE)
//					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
//					.addGap(34))
//				.addGroup(gl_panel_1.createSequentialGroup()
//					.addContainerGap(209, Short.MAX_VALUE)
//					.addComponent(btnNewButton_2))
//		);
//		gl_panel_1.setVerticalGroup(
//			gl_panel_1.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_panel_1.createSequentialGroup()
//					.addComponent(btnNewButton_2)
//					.addGap(24)
//					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
//					.addPreferredGap(ComponentPlacement.UNRELATED)
//					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
//					.addGap(29)
//					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
//					.addGap(18)
//					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
//					.addGap(18)
//					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
//						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
//						.addComponent(lblNewLabel_2))
//					.addGap(27)
//					.addComponent(btnNewButton)
//					.addGap(49))
//		);
//		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand() == "Need Item Post") {
			NeedItemPostWindow window = new NeedItemPostWindow();
			UIManager.put("swing.boldMetal", Boolean.FALSE);
			window.createAndShowGUI();
		} else if (e.getActionCommand() == "Sell Item Post") {
			SellItemPostWindow window = new SellItemPostWindow();
			UIManager.put("swing.boldMetal", Boolean.FALSE);
			window.createAndShowGUI();
		} else if (e.getActionCommand() == "Bid Item Post") {
			CreateBidWindow window = new CreateBidWindow();
			UIManager.put("swing.boldMetal", Boolean.FALSE);
			window.createAndShowGUI();
		}else if(e.getActionCommand()=="N") {
			NotifPage window = new NotifPage();
			UIManager.put("swing.boldMetal", Boolean.FALSE);
			window.createAndShowGUI();
//			info_Panel=new NotifPage();
			
		}

	}
}
