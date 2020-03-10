import java.util.ArrayList;
import java.util.List;

/*
 * I/p string = aabbbbccdd
 * print output as  = a2b3c2d2
 * Program needs to be FIXED
 * 
 */
public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcaaabbb";
		int count =1;
		List<Object>li = new ArrayList<Object>();
		for(int i=0;i<=str.length()-2;i++){
			if(str.charAt(i) == str.charAt(i+1)){
				count++;
			}else{
				char c = str.charAt(i);
				li.add(c);
				if(count>1)
					li.add(count);
				else
					li.add(1);
				count =1;
			}if(str.length()-2==i){
				char c = str.charAt(i);
				li.add(c);
				li.add(count);
			}
		}
		
		System.out.println(li.toString());
				
	}
}
