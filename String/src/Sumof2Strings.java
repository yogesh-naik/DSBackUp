//Sum of two large number Strings
/*

1) Reverse both strings.
2) Keep adding digits one by one from 0’th index (in reversed strings) to end of smaller string, 
 append the sum % 10 to end of result and keep track of carry as sum/10.
3) Finally reverse the result.
 */
public class Sumof2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "198111";
		String str2 = "12";
		StringBuffer sb1 = new StringBuffer(str1);
		StringBuffer sb2 = new StringBuffer(str2);

		String s3 = Sum(sb1.reverse().toString(), sb2.reverse().toString());
		System.out.println(s3);
	}

	public static String Sum(String s1, String s2) {
		StringBuffer sb = new StringBuffer();
		int sum = 0, tempsum = 0, carry = 0;
		for (int i = 0; i <= s2.length() - 1; i++) {
			sum = Character.getNumericValue(s1.charAt(i)) + Character.getNumericValue(s2.charAt(i)) + carry;

			if (sum > 9) {
				int temp = sum % 10;
				sb.append(temp);
				carry = sum / 10;
			} else {
				sb.append(sum);
				carry = 0;
			}
		}

		for (int i = s2.length(); i <= s1.length() - 1; i++) {
			sum = Character.getNumericValue(s1.charAt(i)) + carry;
			if (sum > 9) {
				int temp = sum % 10;
				sb.append(temp);
				carry = sum / 10;
			} else {
				sb.append(sum);
				carry = 0;
			}
		}

		if (carry == 0)
			sb.append(carry);

		return sb.reverse().toString();

	}

}
