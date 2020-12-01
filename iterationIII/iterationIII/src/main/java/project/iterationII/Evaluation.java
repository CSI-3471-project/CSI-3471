package project.iterationII;

public class Evaluation extends Comment{

	private double value;
	Post post;
	Profile theOtherUser;
	

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
		
		double totalValue = theOtherUser.credit*theOtherUser.trade;
		totalValue+=value;
		theOtherUser.trade++;
		theOtherUser.credit=totalValue/theOtherUser.trade;
	}

	public Evaluation(double value, String body) {
		super(body);
		this.value = value;
	}
	
	
	
}
