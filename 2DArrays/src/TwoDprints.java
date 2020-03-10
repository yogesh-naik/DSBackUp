
public class TwoDprints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		*
//		**
//		***
//		****
//		*****

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		for (int i = 5; i>=1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}			
			System.out.println("");
			for (int j = 5-i; j >= 0; j--){
				System.out.print(" ");
			}

		}
		
		String str = "naik";
		StringBuffer sb =  new StringBuffer("Yogesh");
		for(int i=0;i<=str.length()-1;i++)
				sb.append(str.charAt(i));
		
		System.out.println(sb);
		
	}

}
