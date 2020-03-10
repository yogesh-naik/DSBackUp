import java.util.ArrayList;
import java.util.List;


/*
 * Move the char in the string to the right.
 */
		
public class RotatecharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcde";
		StringBuffer sb = new StringBuffer();
		
		
			char p = str.charAt(str.length()-1);
			sb = sb.append(p);
			sb = sb.append(str.substring(0,str.length()-1));			
		
		System.out.println("After moving the char to left' the string is  " +sb);
		
		StringBuffer sb1 = new StringBuffer("Yogesh");
		sb1.setCharAt(2,'p');
		
		List<Integer>li = new ArrayList<Integer>();
		li.add(3);
		li.add(4);
		li.add(5);
		
		int num=0;
		for(int i=0;i<=li.size()-1;i++)
			num = num+li.get(i);
		
		System.out.println(num);
		
		System.out.println("-------- BLEOW---------");
		
		int a[] = {1,2,3,4,5,6};
		
		for(int i=0;i<=4;i++){
			int temp1 = a[0];
			for(int j=0;j<=a.length-2;j++){
				a[j]  = a[j+1];
			}
			a[a.length-1] = temp1;
		}
		
		for(int j=0;j<=a.length-1;j++){
			System.out.println(a[j]);
		}	
			
	}
	
}
