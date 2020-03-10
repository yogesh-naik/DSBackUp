import java.util.ArrayList;
import java.util.List;


public class firstNonrepetiveChar {
/*
 * Find a 1st non-repeated char in the string for e.g. if string is "Salesforce is the 
 * best company to work for” returns 'l'
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Salesforce is the est company to work for";
		str=str.toLowerCase();
		
		for(int i=0;i<=str.length()-2;i++){
			//int ctr =0;
			boolean ctr = false;
			for(int j=i+1;j<=str.length()-1;j++){
				if(str.charAt(i)==str.charAt(j)){
					ctr = true;
					break;
				}
			}if(ctr == false){
				System.out.println("First non repetive char is "+str.charAt(i));
				break;
			}
		}
		
		int a[] = {1,2,3,4,5,6,7};
		int l = a.length;
		for(int i=l-1;i>=(l-1)/2;i--){
			System.out.println(a[i]);
			if(i!=(l-1)/2)
			System.out.println(a[l-1-i]);
		}
	}

}
