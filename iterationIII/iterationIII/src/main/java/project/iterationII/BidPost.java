package project.iterationII;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class BidPost implements Post {
	Date startDate;
	Date EndDate;
	String description;
	double startPrice = 0.0;
	
	@Override
	public void setDescription(String description) {
		this.description = description;	
	}
	@Override
	public String getDescription() {
		return description;
	}
	
	
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
	public List<Comment> getAllComments() {
		return allComments;
	}
	
	
	public BidPost(Date startDate, Date endDate, String description, double startPrice) {
		super();
		this.startDate = startDate;
		EndDate = endDate;
		this.description = description;
		this.startPrice = startPrice;
	}
	@Override
	public void addComment(Comment c) {
		allComments.add(c);
	}
	@Override
	public void removeComment(Long id) {
		allComments.removeIf(c -> c.getId() == id);
		
	}
	
	

}
