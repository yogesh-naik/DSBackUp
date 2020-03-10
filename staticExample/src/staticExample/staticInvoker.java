package staticExample;


public class staticInvoker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Static variables  "+stuff.count);
		
		stuff stuff1 = new stuff();		
		stuff stuff2 = new stuff();
		stuff stuff3 = new stuff();
		
		System.out.println("Count "+stuff1.count);
		System.out.println("ID "+stuff2.id);
		System.out.println("ID "+stuff2.getId());
				
		String str = "pre";

		hello();

	}
	
	public static void hello(){
		System.out.println("hello");
		
	}

}
