
/*
 * interface A
 */

public interface A{

	int i =100;
	
	
	default void display(){
		System.out.println("From interface A");
	}
	//void hola();
	
	/*
	 * This is defined a static/default method hence it can is defined and decalred here.
	 */
	public static void yogesh(){
		System.out.println("yo");
	}
}
