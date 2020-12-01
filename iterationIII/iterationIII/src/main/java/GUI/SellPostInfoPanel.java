package GUI;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import project.iterationII.Post;
import project.iterationII.SellPost;

public class SellPostInfoPanel extends PostInfoPanel {

	/**
	 * Create the panel.
	 */
	JPanel prefer_pay_panel;
	JLabel prefer_pay_label;
	JLabel prefer_pay;
	public SellPostInfoPanel(SellPost p) {
		super();
		post=p;
		
		setPostInfoPanel();
		System.out.println("in sell post info panl constructor: \n item is :"+p.item.getName());
		
		
		
		prefer_pay_panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(description, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(itemPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(prefer_pay_panel, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
						.addComponent(user_postKind, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(13)
					.addComponent(user_postKind, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(itemPanel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(prefer_pay_panel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(description, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(162, Short.MAX_VALUE))
		);
		
		prefer_pay_label = new JLabel("price: $\r\n");
		prefer_pay_panel.add(prefer_pay_label);
		prefer_pay_label.setFont(new Font("Calibri", Font.PLAIN, 20));
		
		prefer_pay = new JLabel(Double.toString(p.getSellPrice()));
		prefer_pay.setFont(new Font("Calibri", Font.PLAIN, 20));
		prefer_pay_panel.add(prefer_pay);
		
		postKind = new JLabel(": sell item\r\n");
		user_postKind.add(postKind);
		postKind.setFont(new Font("Calibri", Font.PLAIN, 20));
		setLayout(groupLayout);
	}

}
