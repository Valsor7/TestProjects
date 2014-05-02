
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MuscleCar pontiac = new MuscleCar(250, 5, 2.0 , "v6", 6, 150.0, 19, "Pontiac", "yellow", false, 23.5);
		SportCar ferrari = new SportCar(250, 3, 1.4, "v8", 5, 750.0, 16, "Ferari", "yellow", true, "fire");
		Car best = new Car();
		ArrayList<String> strMuscle = pontiac.toMyString();
		ArrayList<String> strSport = ferrari.toMyString();
		getCompare(best, ferrari, pontiac, strSport, strMuscle);
	
	}	
	
	public static void getCompare(Car best, SportCar ferrari, MuscleCar pontiac, ArrayList<String> strSport, ArrayList<String> strMuscle) {	
		int i = 0;
		best.compare(ferrari.getSpeed(), pontiac.getSpeed(), strSport.get(i), strMuscle.get(i));
		i++;
		best.compare(ferrari.getAmount(), pontiac.getAmount(), strSport.get(i), strMuscle.get(i));
		i++;
		best.compare(ferrari.getWeight(), pontiac.getWeight(), strSport.get(i), strMuscle.get(i));
		i++;
		best.compare(ferrari.getEngine(), pontiac.getEngine(), strSport.get(i), strMuscle.get(i));
		i++;
		best.compare(ferrari.getTransmission(), pontiac.getTransmission(), strSport.get(i), strMuscle.get(i));
		i++;
		best.compare(ferrari.getCost(), pontiac.getCost(), strSport.get(i), strMuscle.get(i));
		i++;
		best.compare(ferrari.getWheel(), pontiac.getWheel(), strSport.get(i), strMuscle.get(i));
		i++;
		best.compare(ferrari.getBrend(), pontiac.getBrend(), strSport.get(i), strMuscle.get(i));
		i++;
		best.compare(ferrari.getColor(), pontiac.getColor(), strSport.get(i), strMuscle.get(i));
		i++;
		best.compare(ferrari.isNew(), pontiac.isNew(), strSport.get(i), strMuscle.get(i));
		i++;
		best.compare(ferrari.getLabels(), pontiac.getTyresWidth(), strSport.get(i), strMuscle.get(i));
	}

}
