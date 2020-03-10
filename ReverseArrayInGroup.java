
public class ReverseArrayInGroup {

	/*
	 * Input: 
		arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		k = 3
		m = 2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
				int	k = 3,m = 2;
				int count =0;
				int subset = arr.length /(k+m);
				
				for(int i=0;i<=arr.length-1;i++){
					if(i+k<arr.length){
						count =k;
						while(count>0){
							System.out.print(arr[i+count-1]);
							count--;
						}
					} 
					subset--;
					if(subset>=0){
						i = i+k;
					}
					if(i+m < arr.length-1){
						count = m;
						while(count > 0){
							System.out.print(arr[i]);
							i++;count--;
						}
					}else{
						for(int p=i;p<=arr.length-1;p++){
							System.out.print(arr[p]);
						}break;
					}i = i-1;
				}
	}

}
