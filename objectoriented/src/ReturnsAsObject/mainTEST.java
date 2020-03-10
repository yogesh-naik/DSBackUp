package ReturnsAsObject;

/*
 * When you return object S from method of class AREA 
 */
public class mainTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area area = new Area();
		shape p = area.getAB(10, 20);
		
		shape sp = new shape();
		sp.displayAB(p);
	}

}
