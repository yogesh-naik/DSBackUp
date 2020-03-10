package objectAsParameter;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box myBox1 = new Box(2,3,5);
		
		int vol1 = myBox1.volume();
		System.out.println("Volume1 "+vol1);
		
		Box myBox2 = new Box(myBox1);
		int vol2 = myBox2.volume();
		System.out.println("Volume2 "+vol2);
		
	}

}
