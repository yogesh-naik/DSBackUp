
public class AddNoFromString {
	
	/*
	 * Take the String as input and add the digits present in that.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a2sdf4a100fggt8";
		char[] arr = s.toCharArray();
		int total = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= arr.length-1; i++) {
			if (Character.isDigit(arr[i])) {
				sb.append(arr[i]);
			} else {
				if (sb.length() !=0)
					total = total + Integer.parseInt(sb.toString());
				sb = new StringBuilder();
			}
		}
		if (!sb.toString().isEmpty())
			total = total + Integer.parseInt(sb.toString());
		System.out.println(total);

		
		String a = "test";
		String b = new String("test");

		if(a == (b)){
			System.out.println("Hello");
		}
	}
		
}
