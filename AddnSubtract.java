import java.util.HashMap;
import java.util.Random;
import java.util.Set;


/*
 * Write code to sum 2 integer but u cant use a+b method, \
 * you have to use either ++ or --. How you will handle negative numbers.
*/
public class AddnSubtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5 ,b=-2;
		
		if((a>0 && b>0) || (a<0 && b>0)){
			
			while(b>0){
				a++;
				b--;
			}
		}
		int temp=0;
		if(a>0 && b<0){
			while(a>0){
				--a;
				temp=++b;
			}
		}
		if(a<0 && b<0){
			while(a<0){
				a++;
				temp=--b;
			}
		}
		
		System.out.println(temp);
		
		HashMap<Integer,Character> hm = new HashMap<Integer,Character>();
		hm.put(1,'p');
		hm.put(2,'q');
		hm.put(34,'r');
		hm.put(33,'s');
		
		Set<Integer> i = hm.keySet();
		int tem = 0;
		for(Integer p:i){
			if(p>tem){
				tem = p;
			}
			
		}System.out.println(tem);
		
		int at[] = {1,2,3,4,5};
		System.out.println(at[at.length-3]);
		
		String s = "www.space%20.com";
		s = s.replace("%20","");
		System.out.println(s);
		
		int arr[] = {1,4,5,2,3,4,5,6};
		System.out.println("Here is "+ arr[arr.length-2]);
		for(int i1=0;i1<arr.length-2;i1++){
			int t =0;
			for(int j=i1;j<=i1+2;j++){
				if(t < arr[j])
					t = arr[j];
				}
			//System.out.println("Here is "+t);
		}
		Random randomGenerator = new Random();
		int a1[] = new int[52];
		for(int j = 0;j<=51;j++)
			a1[j]=j;
		for(int j=0;j<=51;j++){
			 temp = randomGenerator.nextInt(51);
			 int temp2 = a1[temp];
			 a1[temp] = a1[j];
			 a1[j] = temp2;
			
		}
		for(int j = 0;j<=51;j++)
			System.out.println(a1[j]);
			
	}
	
	

	private static int rand(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
