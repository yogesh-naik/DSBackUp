
public class LongestSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sp ="bbbbaaaaaaaaaaaaaaaaacddddeeeeee";
		
		int ctr =1;
		int l = 1;
	
		for(int i=0;i<=sp.length()-2;i++){
			if(sp.charAt(i) ==sp.charAt(i+1)){
				ctr++;
			}
			if(sp.charAt(i)!=sp.charAt(i+1) && ctr >l){
				l=ctr;
				ctr=1;
			}
		}
			System.out.println(l);

	}

}
