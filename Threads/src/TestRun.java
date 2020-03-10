
public class TestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FooRunable rn = new FooRunable();
		Thread one = new Thread(rn);
		Thread two = new Thread(rn);
		Thread three = new Thread(rn);
		Thread four = new Thread(rn);
		
		one.start();
		three.start();
		four.start();
		two.start();		
	}

}
