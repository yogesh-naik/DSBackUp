
public class MaxConsecutive1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {0, 1, 0, 1, 1, 1, 1,0};
		
		int temp = 1 , ctr = 1;
		
		for(int i=0;i<=A.length-2;i++) {
			if(A[i] == 1 &&  A[i+1] == 1) {
				temp++;
			}else {
				ctr = temp;
				temp = 1;
			}
		}
		
		if(temp > ctr) {
			System.out.println(temp);
		}
		else
			System.out.println(ctr);

	}

}
