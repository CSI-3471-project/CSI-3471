package project.iterationII;

public class SellPost implements Post {
	double sellPrice=0.0;
	public void setSellPrice(Double price) {
		this.sellPrice= price;
	}
	public Double getSellPrice() {
		return this.sellPrice;
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription(String description) {
		// TODO Auto-generated method stub
		return null;
	}

}
