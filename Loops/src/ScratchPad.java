
public class ScratchPad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String S = "ABCD";
//		String P = "ABCD";
//		
//		String sp = "Madam, I'm Adam";
//		sp = sp.replaceAll(",","");
//		
//		System.out.println(sp);
//		
//		System.out.println(P.equals(S));
//		
//		method(null);
//		
//		long longWithL = 1000*60*60*24*365L;
//		long longWithoutL = 1000*60*60*24*365;
//		System.out.println(longWithL);
//		System.out.println(longWithoutL);
//	}
//	
//	public static void method(Object o) {
//        System.out.println("Object impl");
//    }
//    public static void method(String s) {
//        System.out.println("String impl");
		
		for(int i=0;i<=3;i++){				
			for(int j=0;j<=(3-i);j++){
				System.out.print(" ");
			}System.out.print("*");
			System.out.println();
		}
		
		String str = "abcxyz";
		int count =0;
		for(int i=0;i<=str.length()-3;i++){
			if(str.substring(i,i+3).equalsIgnoreCase("xyz") && str.charAt(i-1)!='.'){
				count++;
			}
			System.out.println(count);
		}
    }

}
