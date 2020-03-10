/*
 * Find out the distance between two specific words in a String
 */
public class DistanceIn2Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "the brown quick frog quick the mans";
		String w1 = "mans";
		String w2 = "frog";
		
		String []words = str.split(" ");
		int i1 =0;
		int i2 = 0;
		
		int distance=0;

		for(int i=0;i<=words.length-1;i++){
		 if(!w1.equals(w2)){
			if(words[i].equalsIgnoreCase(w1)){
				i1 = i;
			}
			if(words[i].equalsIgnoreCase(w2)){
				i2 = i;
			}
		 }else {
			 
		 }
		 
		}//end of for loop
		if(i1>i2){
			distance = i1-i2;
		}else{
			distance = i2-i1;
		}
		
		System.out.println("Distance between two words "+distance);
	}

}
