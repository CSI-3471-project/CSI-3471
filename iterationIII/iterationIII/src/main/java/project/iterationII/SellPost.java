package project.iterationII;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SellPost implements Post {
	
	private double sellPrice=0.0;
	private String description;
	
	
	public SellPost(double sellPrice, String description) {
		super();
		this.sellPrice = sellPrice;
		this.description = description;
	}
	
	
	public void setSellPrice(Double price) {
		this.sellPrice= price;
	}
	public Double getSellPrice() {
		return this.sellPrice;
	}
	
	@Override
	public void setDescription(String description) {
		this.description = description;		
	}
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public List<Comment> getAllComments() {
		return allComments;
	}


	@Override
	public void addComment(Comment c) {
		allComments.add(c);
		
	}


	@Override
	public void removeComment(Long id) {
		// TODO Auto-generated method stub
		
	}

/*
	@Override
	public void removeComment(Long id) {
		allComments.removeIf(c -> c.getId() == id);
	}

	
	*/
	
	

}
