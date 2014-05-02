import java.util.ArrayList;


public class SportCar extends Car {
	
	private String labels;
	
	public SportCar(int speed, int amount, Double weight, String engine, int transmission, Double cost, int wheel, String brend, String color, boolean isNew, String labels) {
		// TODO Auto-generated constructor stub
		super(speed, amount, weight, engine, transmission, cost, wheel, brend, color, isNew);
		setLabels(labels);
	}
	
	@Override
	public ArrayList<String> toMyString() {
		// TODO Auto-generated method stub
		ArrayList<String> mystrArr =  super.toMyString();
		mystrArr.add("labels");
		return mystrArr;
	}

	public String getLabels() {
		return labels;
	}


	public void setLabels(String labels) {
		this.labels = labels;
	}
}
