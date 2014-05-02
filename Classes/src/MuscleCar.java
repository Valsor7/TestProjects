import java.util.ArrayList;


public class MuscleCar extends Car {

	private Double tyresWidth;
	
	public MuscleCar(int speed, int amount, Double weight, String engine, int transmission, Double cost, int wheel, String brend, String color, boolean isNew, Double tyresWidth) {
		// TODO Auto-generated constructor stub
		super(speed, amount, weight, engine, transmission, cost, wheel, brend, color, isNew);
		setTyresWidth(tyresWidth);
	}
	
	@Override
	public ArrayList<String> toMyString() {
		// TODO Auto-generated method stub
		ArrayList<String> mystrArr =  super.toMyString();
		mystrArr.add("tyresWidth");
		return mystrArr;
	}

	public Double getTyresWidth() {
		return tyresWidth;
	}

	public void setTyresWidth(Double tyresWidth) {
		this.tyresWidth = tyresWidth;
	}
	
}
