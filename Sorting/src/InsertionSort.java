
public class InsertionSort {

	/**
	 * Time complexity = O(n2)
	 * Space complexity = O(1)
	 */
	public static void main(String[] args) {
		int[] p = { 32, 0, -2, 1, 100, 2, 03 };
		//insertionSort(p);
		insertionsort2(p);
		for (int i = 0; i <= p.length - 1; i++) {
			System.out.println(p[i]);
		}
	}

	public static int[] insertionSort(int[] arr) {

		for (int i = 0; i <=arr.length-1; i++) {
			for (int j = i; j >0; j--) {
				if (arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void insertionsort2(int arr[] ){
		for(int i=0;i<=arr.length-1;i++){
			for(int j=i;j>0;j--){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
}
