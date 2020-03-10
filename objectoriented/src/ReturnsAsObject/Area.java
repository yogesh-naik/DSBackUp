package ReturnsAsObject;

public class Area {

	
	public shape getAB(int A ,int B){
		shape s = new shape();
		s.setA(A);
		s.setB(B);
		
		return s;  //Returns set Object
	}
		
}
