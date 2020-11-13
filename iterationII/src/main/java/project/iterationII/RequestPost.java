package project.iterationII;

public class RequestPost implements Post{
	double price=0.0;
	public void setRequestPrice(Double price) {
		this.price = price;
	}
	public Double getRequestPrice() {
		return this.price;	
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
