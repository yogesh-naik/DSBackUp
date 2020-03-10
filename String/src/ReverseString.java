import java.util.Arrays;


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Reverse the string
		 */
		
		String str = "!This is Yogesh";
		String s ="";
		StringBuffer sb = new StringBuffer();
		
		String arr[] = str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--){
			//s = s + arr[i];
			sb = sb.append(arr[i]);
			
			if((arr.length) != 0){
				sb  = sb.append(" ");
			}
		}
		
		System.out.println(sb.toString());
		

		
	}

}
