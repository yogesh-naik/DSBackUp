
public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Waterbottle";
		String s2 = "erbottlewat";
		
		System.out.println(subString(s1,s2));
		

	}

	public static boolean subString(String s1 ,String s2){
		s1 = s1+s1;
		boolean flag =false;
		for(int i=0;i<=s1.length()-s2.length()-1;i++){
			if(s1.substring(i,i+s2.length()).equalsIgnoreCase(s2)){
				flag = true;
				break;
			}
		}
		
		if(flag==true)
			return true;
		else
			return false;
	}
}
