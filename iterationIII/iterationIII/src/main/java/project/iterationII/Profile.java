package project.iterationII;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Profile {
	
	private String userName;
	private String password;
	public int trade;
	public double  credit;
	private List<Comment> allComments;
	private List<Evaluation> allEvals;
	
	public String getPassaword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Profile(String userName) {
		super();
		this.userName = userName;
		trade = 0;
		allComments = new ArrayList<>();
		allEvals = new ArrayList<>();
	}
	
	public Profile() {
		userName = "";
		trade = 0;
		allComments = new ArrayList<>();
		allEvals = new ArrayList<>();
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
	
	public double getCredit() {
		return allEvals.stream().collect(Collectors.summingDouble(Evaluation::getValue));
	}
	
	public void addEvaluation(Evaluation e) {
		allEvals.add(e);
	}
	
	
	
	
	
	
	
	
}
