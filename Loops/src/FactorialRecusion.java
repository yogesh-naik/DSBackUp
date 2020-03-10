
public class FactorialRecusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p = Fact(3);
		System.out.println(p);
	}
	
	public static int Fact(int n){
		int result = 1;
		if(n == 1)
			return 1;
		if(n<1)
			return 0;
		if(n>1){
			return Fact(n-1)*n;
		}
		return 5;
	}

}
