
public class StringReverse {
	static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Yogesh Naik";
		Reverse(s,s.length());
		System.out.println(sb);
	}

	
	
	public static void Reverse(String s,int len){
		if(len <=0)
			return;
		else{
			sb.append(s.charAt(len-1));
			len--;
			Reverse(s,len);
		}
	}
}
