
public class scratchpad2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Yogesh";
		int l = str.length()-1;
		String rev ="";
		rev = func(str,l,rev);
		System.out.println(rev.toString());
	}
	static String func(String str ,int ctr,String sb){
		
	int i= ctr;
	

	if(i>=0){
		sb = sb + str.charAt(i);
		i--;
		sb = func(str,i,sb);
		
	}
	
	return sb;
	}

}
