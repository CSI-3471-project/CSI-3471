package project.iterationII;

public class Evaluation extends Comment{

	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Evaluation(double value, String body) {
		super(body);
		this.value = value;
	}
	
	
	
}
