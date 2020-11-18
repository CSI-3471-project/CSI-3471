package project.iterationII;

import java.sql.Date;

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

}
