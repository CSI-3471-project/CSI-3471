package project.iterationII;

import java.util.ArrayList;
import java.util.List;

public class Profile {
	
	private String userName;
	private List<Comment> allComments;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Profile(String userName) {
		super();
		this.userName = userName;
		allComments = new ArrayList<>();
	}

	public List<Comment> getAllComments() {
		return allComments;
	}
	
	
	public void addComment(Comment c) {
		allComments.add(c);
		
	}

	public void removeComment(Long id) {
		allComments.removeIf(c -> c.getId() == id);
	}
	
	
	
	
	
	
	
}
