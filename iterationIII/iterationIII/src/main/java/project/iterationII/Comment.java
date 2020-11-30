package project.iterationII;

import java.util.Date;

public class Comment {
	private Date timeOfCreation;
	private Date timeOfLastEdit;
	private static Long idMaker = 0L;
	private Long id;
	private String body;

	
	public Comment(String body) {
		this.body = body;
		timeOfCreation = new Date(System.currentTimeMillis());
		timeOfLastEdit = new Date(System.currentTimeMillis());
		id = idMaker++;
	}
	
	public Date getTOC() {
		return timeOfCreation;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
		timeOfLastEdit = new Date(System.currentTimeMillis());
	}

	public Date getTimeOfLastEdit() {
		return timeOfLastEdit;
	}

	public Long getId() {
		return id;
	}

	
	
}
