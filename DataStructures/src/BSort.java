import java.util.ArrayList;

public class BSort {

	public static int Fact(int n){
		if(n ==0) return 1; //For recursion always put breaking condition
		else
			return n*Fact(n-1);
		//return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 2, 8, 4, 7 };

		for (int i = 0; i <= a.length - 2; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i <= a.length - 1; i++)
			System.out.println("Array " + a[i]);
		
		
		int N = Fact(33);
			System.out.println("Here is "+N);
		

	}
}
