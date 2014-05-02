import java.util.ArrayList;



public class Car {
	
	private int speed;
	private int amount;
	private Double weight;
	private String engine;
	private int transmission;
	private Double cost;
	private int wheel;
	private String brend;
	private String color;
	private boolean isNew;
	
	public Car(int speed, int amount, Double weight, String engine, int transmission, Double cost, int wheel, String brend, String color, boolean isNew) {
		// TODO Auto-generated constructor stub
		this.speed = speed;
		this.amount = amount;
		this.weight = weight;
		this.engine = engine;
		this.transmission = transmission;
		this.cost = cost;
		this.wheel = wheel;
		this.brend = brend;
		this.color = color;
		this.isNew = isNew;
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public void compare(int sportCar,int muscleCar, String sportStr, String muscleStr){
		Object o1 = sportCar;
		Object o2 = muscleCar;
		
		
		if (sportCar > muscleCar) {
			System.out.println("Sport car " + sportStr+ " = " + o1.toString()  + ". It is bigger then muscle car " + muscleStr + ", becouse muscle car " +muscleStr+ " = "+o2.toString());
		} else {
			if (sportCar < muscleCar) {
				System.out.println("Sport car " + sportStr+ " = " + o1.toString()  + ". It is less then muscle car " + muscleStr + ", becouse muscle car " +muscleStr+ " = "+o2.toString());
			} else System.out.println("Sport car "+sportStr+" is the same as muscle car "+muscleStr+", becouse sport car " + sportStr+ " = " + o1.toString()  + ", " + " muscle car " +muscleStr+ " = "+o2.toString());
		}
	}
	
	public void compare(String sportCar, String muscleCar, String sportStr, String muscleStr){
		Object o1 = sportCar;
		Object o2 = muscleCar;
		if (sportCar.equals(muscleCar)) {
			System.out.println("Sport car "+sportStr+" is the same as muscle car "+muscleStr+", becouse sport car " + sportStr+ " is " + o1.toString()  + ", " + " muscle car " +muscleStr+ " is "+o2.toString());
		} else {
			System.out.println("It is not the same, becouse sport car " + sportStr+ " is " + o1.toString()  + ", " + " muscle car " +muscleStr+ " is "+o2.toString());
		}
	}
	
	public void compare(Double sportCar, Double muscleCar, String sportStr, String muscleStr){
		Object o1 = sportCar;
		Object o2 = muscleCar;
		if (sportCar > muscleCar) {
			System.out.println("Sport car " + sportStr+ " = " + o1.toString()  + ". It is bigger then muscle car " + muscleStr + ", becouse muscle car " +muscleStr+ " = "+o2.toString());
		} else {
			if (sportCar < muscleCar) {
				System.out.println("Sport car " + sportStr+ " = " + o1.toString()  + ". It is less then muscle car " + muscleStr + ", becouse muscle car " +muscleStr+ " = "+o2.toString());
			} else System.out.println("Sport car "+sportStr+" is the same as muscle car "+muscleStr+", becouse sport car " + sportStr+ " = " + o1.toString()  + ", " + " muscle car " +muscleStr+ " = "+o2.toString());
		}
	}
	
	public void compare(Boolean sportCar, Boolean muscleCar, String sportStr, String muscleStr){
		if (sportCar && muscleCar) {
			System.out.println("Both car are new");
		} else {
			if (sportCar == false && muscleCar == false) {
				System.out.println("Both car are old");
			} else {
				if (sportCar) {
					System.out.println("Sport car is new and muscle car is old");
				}	
				if (muscleCar) {
					System.out.println("Sport car is old and muscle car is new");
				}
			}
		}
	}
	
	public void compare(Object sportCar, Object muscleCar, String sportStr, String muscleStr){
		if (!(sportCar.getClass().equals(muscleCar.getClass()))) {
			System.out.println("It is different stuff, becouse Sport car " +sportStr+" " +sportCar.getClass() + " and  muscle car " + muscleStr + " " +muscleCar.getClass());
		} 
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getTransmission() {
		return transmission;
	}
	public void setTransmission(int transmission) {
		this.transmission = transmission;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	public String getBrend() {
		return brend;
	}
	public void setBrend(String brend) {
		this.brend = brend;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public ArrayList<String> toMyString() {
		ArrayList<String> strArr = new ArrayList<>();
		strArr.add("speed");
		strArr.add("amount");
		strArr.add("weight");
		strArr.add("engine");
		strArr.add("transmission");
		strArr.add("cost");
		strArr.add("wheel");
		strArr.add("brend");
		strArr.add("color");
		strArr.add("isNew");
		return strArr; 
	}
	
}
