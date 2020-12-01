package project.iterationII;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.Color;

public class UserPanel extends JPanel {
	/**
	 * @wbp.nonvisual location=61,178
	 */
	private final Component verticalStrut = Box.createVerticalStrut(20);
	/**
	 * @wbp.nonvisual location=61,268
	 */
	private final Component verticalStrut_1 = Box.createVerticalStrut(20);
	/**
	 * @wbp.nonvisual location=51,348
	 */
	private final Component verticalStrut_2 = Box.createVerticalStrut(20);
	Profile user;

	/**
	 * Create the panel.
	 */
	public UserPanel(Profile u) {
		setBackground(Color.WHITE);
		
		user=u;
		
		JLabel UserName = new JLabel(user.getUserName());
		UserName.setFont(new Font("Calibri", Font.BOLD, 30));
		
		JPanel tradePanel = new JPanel();
		tradePanel.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		
		JButton chat = new JButton("chat");
		chat.setFont(new Font("Calibri", Font.PLAIN, 25));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(44)
							.addComponent(UserName, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(30)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(40)
							.addComponent(chat))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(tradePanel, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(292, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(116)
					.addComponent(UserName)
					.addGap(47)
					.addComponent(tradePanel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(49)
					.addComponent(chat)
					.addContainerGap(63, Short.MAX_VALUE))
		);
		
		JLabel trade_label = new JLabel("Trade: ");
		panel_1.add(trade_label);
		trade_label.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel trade = new JLabel(Integer.toString(user.trade));
		panel_1.add(trade);
		trade.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel credit_label = new JLabel("credit: ");
		tradePanel.add(credit_label);
		credit_label.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel credit = new JLabel(Double.toString(user.getCredit()));
		tradePanel.add(credit);
		credit.setFont(new Font("Calibri", Font.PLAIN, 25));
		setLayout(groupLayout);

	}
}
