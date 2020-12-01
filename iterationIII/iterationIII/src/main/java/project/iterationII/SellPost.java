package project.iterationII;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import GUI.RequestPostInfoPanel;
import GUI.SellPostInfoPanel;

public class SellPost extends Post {
	
	private double sellPrice=0.0;

	Profile user;
	public Item item;
		
	
	public SellPost(Profile u,String name,double sellPrice, String description) {
		super();
		item=new Item();
		System.out.println(name+sellPrice+description);
		this.sellPrice = sellPrice;
		this.item.name=name;
		this.item.description = description;
		user=u;
		
	}
	
	
	public void setSellPrice(Double price) {
		this.item.price=sellPrice;
		this.sellPrice= price;
	}
	public Double getSellPrice() {
		return this.sellPrice;
	}
	
	public SellPostInfoPanel setPostInfoPanel() {
		System.out.println("...in set post info panel function: \n item is: "+item.name);
		return new SellPostInfoPanel(this);
	}
	

/*
	@Override
	public void removeComment(Long id) {
		allComments.removeIf(c -> c.getId() == id);
	}

	
	*/
	
	

}
