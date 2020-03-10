public class StringCombination {
	/*
	 * String s = "wxyz";
	 * 
	 * ouput = " w wx wxy wxyz wxz wy wyz wz x xy xyz xz y yz z " 
	 */
	
	private static StringBuilder output = new StringBuilder();
	static String inputstring = "wxyz";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		combine(0);
	}

	private static void combine(int start) {
		for (int i = start; i < inputstring.length(); ++i) {
			output.append(inputstring.charAt(i));
			System.out.println(output);
			if (i < inputstring.length())
				combine(i + 1);
			output.setLength(output.length() - 1);
		}
	}

}
