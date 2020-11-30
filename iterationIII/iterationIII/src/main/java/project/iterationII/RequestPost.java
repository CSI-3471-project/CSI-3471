package project.iterationII;

import java.util.List;

public class RequestPost implements Post{
	double price=0.0;
	String description;
	public void setRequestPrice(Double price) {
		this.price = price;
	}
	public Double getRequestPrice() {
		return this.price;	
	}
	@Override
	public void setDescription(String description) {
		this.description = description;		
	}

	@Override
	public String getDescription() {
		return this.description;
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
		allComments.removeIf(c -> c.getId() == id);
	}

}
