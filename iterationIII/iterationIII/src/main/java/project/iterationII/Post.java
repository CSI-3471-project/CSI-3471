package project.iterationII;

import java.util.ArrayList;
import java.util.List;

import GUI.PostInfoPanel;
import GUI.RequestPostInfoPanel;

/*
 * This is the interface for the post windows, which will be inherit and implements
 * by three sub-post windows: RequestPost, SellPost, and BidPost.
 */
public abstract class Post {
	List<Comment> allComments = new ArrayList<>();
	public Profile user;
	public Item item;
	
	

	public void setDescription(String description) {
		this.item.description = description;		
	}


	public String getDescription() {
		return this.item.description;
	}

	public List<Comment> getAllComments() {
		return allComments;
	}
	
	

	public void addComment(Comment c) {
		allComments.add(c);
		
	}
	
	public abstract PostInfoPanel setPostInfoPanel() ;
/*

	@Override
	public void removeComment(Long id) {
		allComments.removeIf(c -> c.getId() == id);
	}*/

	public void removeComment(Long id) {
		// TODO Auto-generated method stub
		
	}
}
