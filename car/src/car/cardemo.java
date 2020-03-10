package car;

public class cardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car jeep = new car();
		
		jeep.setSpeed(100);
		jeep.showSpeed();
		
		//change of object
		jeep.changeofcar(jeep);
		jeep.showSpeed();

	}
	
	

}
