package project.iterationII;

import java.util.ArrayList;
import java.util.List;

/*
 * This is the interface for the post windows, which will be inherit and implements
 * by three sub-post windows: RequestPost, SellPost, and BidPost.
 */
public interface Post {
	final List<Comment> allComments = new ArrayList<>();
	
	public void setDescription(String description);
	public String getDescription();
	public List<Comment> getAllComments();
	public void addComment(Comment c);
	public void removeComment(Long id);
}
