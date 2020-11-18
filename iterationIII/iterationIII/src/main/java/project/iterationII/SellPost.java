package project.iterationII;

public class SellPost implements Post {
	double sellPrice=0.0;
	String description;
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

}
