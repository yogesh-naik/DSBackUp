
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-2,
				0,
				1,
				2,
				3,
				32,
				100};
		boolean p = BinarySearch(a,0,a.length-1,32);
		System.out.println(p);
	}

	public static boolean BinarySearch(int arr[],int low, int high,int key){
	
		if(arr.length== 0){
			return false;
		}
				
		while(high>low){
			int mid = low + (high-low)/2;
			if(arr[mid] == key){
				//System.out.println("match found");
				return true;
			}
			if(arr[mid]>key){
				//low =0;
				high=mid-1;
				return BinarySearch(arr,0,mid-1,key);
			}
			if(arr[mid]<key){
				low = mid+1;
				//high = arr.length;
				return BinarySearch(arr,mid+1,high,key);
			}			
		}
		
		return false;
	}
}
