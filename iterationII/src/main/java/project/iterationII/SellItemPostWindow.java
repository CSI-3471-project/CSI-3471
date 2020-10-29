package project.iterationII;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SellItemPostWindow extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public SellItemPostWindow() {
		
		JButton btnNewButton = new JButton("view image:");
		
		JLabel lblNewLabel = new JLabel("Name:\r\n");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 26));
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 26));
		textField.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Calibri", Font.PLAIN, 26));
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("$");
		formattedTextField.setFont(new Font("Calibri", Font.PLAIN, 26));
		
		JLabel lblNewLabel_1 = new JLabel("Description:\r\n");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 26));
		
		JTextArea textArea = new JTextArea();
		
		JButton btnNewButton_1 = new JButton("Post\r\n");
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 26));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(177)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(54)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(formattedTextField)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
								.addComponent(lblNewLabel_1)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(158)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(39)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		setSize(451,518);

	}
	
	static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Sell Item Post");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //Add contents to the window.
        frame.getContentPane().add(new SellItemPostWindow());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
