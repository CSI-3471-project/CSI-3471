package project.iterationII;

import java.util.List;

import GUI.RequestPostInfoPanel;

public class RequestPost extends Post{
	double price=0.0;

	Profile user;
	Item item;
	
	public void setRequestPrice(Double price) {
		this.price = price;
	}
	public Double getRequestPrice() {
		return this.price;	
	}

	public RequestPostInfoPanel setPostInfoPanel() {
		return new RequestPostInfoPanel(this);
	}

}
