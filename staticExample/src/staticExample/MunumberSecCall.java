package staticExample;

public class MunumberSecCall {

	static final int a = 13;
	
	public static void display(){
		int p = 22;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        MyNumberSumRec mns = new MyNumberSumRec();
		        
		        MunumberSecCall pt = new MunumberSecCall();
		        pt.display();
		        System.out.println("Sum is: "+mns.getNumberSum(223));
		        
		        
	    }
}
