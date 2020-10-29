package project.iterationII;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class LoginPage extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 34, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 37, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, -174, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, -51, SpringLayout.EAST, contentPane);
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("Bear ID\r\n");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 25));
		panel.add(lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 149, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 112, SpringLayout.WEST, contentPane);

		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 25));
		panel.add(textField);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, -41, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, -206, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, 64, SpringLayout.EAST, contentPane);
		textField.setColumns(10);

		JPanel panel_1 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, 17, SpringLayout.SOUTH, panel);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, panel);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, -51, SpringLayout.EAST, contentPane);
		contentPane.add(panel_1);

		JLabel lblPassword = new JLabel("Password\r\n");
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 25));

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Calibri", Font.PLAIN, 25));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1
				.createSequentialGroup().addGap(4).addComponent(lblPassword).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE).addGap(36)));
		gl_panel_1
				.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup().addGap(5)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPassword))));
		panel_1.setLayout(gl_panel_1);

		JButton btnNewButton = new JButton("Log in\r\n");
		btnNewButton.setActionCommand("log in");
		btnNewButton.addActionListener(this);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -165, SpringLayout.EAST, contentPane);
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 25));
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("create an account\r\n");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, -26, SpringLayout.NORTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -6, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -140, SpringLayout.EAST, contentPane);
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		contentPane.add(btnNewButton_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand() == "log in") {

			if (textField.getText().equals("User") && passwordField.getText().equals("password")) {
				this.dispose();
				mainPage window = new mainPage();
				window.frame.setVisible(true);
			}else {
				System.out.println(textField.getText());
				System.out.println(passwordField.getText());
			}
		}

	}
}
