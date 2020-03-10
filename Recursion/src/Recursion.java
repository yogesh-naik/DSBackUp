
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumofDigits("1234",0);
		
		int c = Count_C("cacaec");
		System.out.println(c);
		
		System.out.println("Exponential "+Expo(5,3));
		
		Permutation("abc",0);
		
		int a[] = {1,2,3,4};
		int sum =SumofArray(a,0,0);
		System.out.println(sum);
		
		System.out.println(Palindrome("ABba"));
	}
	
	/*
	 * 
	 * Sum of all digits from String using recursion
	 */
	public static void  SumofDigits(String s,int sum){
		int l = s.length();
		
		if(l == 0){
			System.out.println("Sum "+sum);
		}
		else{
			int c = s.charAt(0) -'0';
			//return SumofDigits(s.substring(1)) + c;
			sum = sum + c;
			SumofDigits(s.substring(1) , sum);
		}
	}

	/*
	 * Count no of C in String
	 */
	public static int  Count_C(String s){
		int l = s.length();
		
		if(l == 0){
			return 0;
		}
		else{
			if(s.charAt(0)=='c')
				return Count_C(s.substring(1))+1;
			else{
				return Count_C(s.substring(1));
			}
		}
	}
	
	public static int  Expo(int N,int m){
		
		if(m ==0){
			return 1;
		}
		else{
			return N*Expo(N,m-1);
		}
	}
	
	public static void Permutation(String s,int i){
		
		if(s.length() == 0)
			return ;
		else{
			char ch = s.charAt(i);
			System.out.println(s.substring(0,i)+s.charAt(i)+s.substring(i+1,s.length()));
			Permutation(s.substring(i+1),i);
		}
	}
	
	/*
	 * Sum of number in Array
	 */
	public static int  SumofArray(int[] arr,int ctr,int sum){
		
		if(ctr == arr.length)
			//System.out.println(sum);
			return 0;
		else{		
			//ctr++;
			sum = arr[ctr++];
			return sum+SumofArray(arr,ctr,sum);
		}
	}
	
	public static boolean Palindrome(String s,int i){
		int l = s.length();
		if(l==0)
			return false;
		else if(s.charAt(i) != s.charAt(l-1-i))
			return false;
		else if(s.charAt(i)==s.charAt(l-1-i) && i==l-1){
			return true;
		}
		else{
			i++;
			return Palindrome(s,i);
		}
	}
	
	public static boolean Palindrome(String s){
		return Palindrome(s.toLowerCase(),0);
	}
}
