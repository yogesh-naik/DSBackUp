package OOPSScratch;

public class EF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		E e = new E();
		F f= new F();
		
		f.x = new StringBuffer("hello");
		e.x = 23;
		
//		System.out.println("New StringBuffer: "+f.x);
//		System.out.println("integer: "+e.x);
		//f.print();
		
		E g = new F();
		g.print();
		g.x = 23;
	
						
	}

}
