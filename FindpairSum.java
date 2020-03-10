
public class FindpairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {1,10,2,7,6,1,5};
		int sum = 8;
				
		for(int i = 0 ;i<=arr.length-2;i++){
			for (int j = i+1;j<=arr.length-1;j++){
				int N = sum -arr[i];
				if(arr[j] == N){
					System.out.println("Pair is "+ arr[i]+"&"+ arr[j]);
				}
			}
		}
		
		
	}

}
