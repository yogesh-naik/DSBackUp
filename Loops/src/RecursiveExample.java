
public class RecursiveExample {

	/**
	 * Without using loops, write a function to print 1 to 500 in serial order.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		display(i);
		
		
	}
	
	public static void display(int i){		
		if(i!=10){
			System.out.println("Print number "+ i++);
			display(i);
		}
	}

}
