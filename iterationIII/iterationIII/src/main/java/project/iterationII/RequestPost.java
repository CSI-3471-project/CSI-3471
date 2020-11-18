package project.iterationII;

public class RequestPost implements Post{
	double price=0.0;
	String description;
	public void setRequestPrice(Double price) {
		this.price = price;
	}
	public Double getRequestPrice() {
		return this.price;	
	}
	@Override
	public void setDescription(String description) {
		this.description = description;		
	}

	@Override
	public String getDescription() {
		return this.description;
	}

}
