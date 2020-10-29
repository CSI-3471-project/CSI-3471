package project.iterationII;

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
import java.awt.Color;
import java.awt.Font;

public class mainPage {

	private JFrame frame;
	private JTextField textField;
	private JMenuBar menuBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage window = new mainPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 564, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		frame.getContentPane().add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		// chat button
		JButton chat = new JButton("Chat");
		chat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String result = (String) JOptionPane.showInputDialog(frame, "Enter your message");
			}
		});
		chat.setBackground(Color.WHITE);
		chat.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(chat, BorderLayout.WEST);
		// Menu bar as the notification
		menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 0, 0));
		menuBar.setToolTipText("");
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        JMenu menu;
        JMenuItem menuItem;
        menu = new JMenu("Notification");
        menuBar.add(menu);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		  menuItem = new JMenuItem("Need Item Post");
	        menu.add(menuItem);
	        menuItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            }
	        });
			  menuItem = new JMenuItem("Sell Item Post");
		        menu.add(menuItem);
		        menuItem.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            }
		        });
				  menuItem = new JMenuItem("Bid Item Post");
			        menu.add(menuItem);
			        menuItem.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			            }
			        });
		frame.setJMenuBar(menuBar);
	}

}
