package project.iterationII;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import GUI.PostInfoPanel;

public class BidPost extends Post {
	Date startDate;
	Date EndDate;
	String description;
	double startPrice = 0.0;
	Profile user;
	Item item;
	
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public double getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(double startPrice) {
		this.startPrice = startPrice;
	}
	public BidPost(Date startDate, Date endDate, String description, double startPrice) {
		super();
		this.startDate = startDate;
		EndDate = endDate;
		this.description = description;
		this.startPrice = startPrice;
	}
	@Override
	public PostInfoPanel setPostInfoPanel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
