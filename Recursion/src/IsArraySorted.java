
public class IsArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,3,4,5};
		isSortedArray(A);
	}
	
	static void isSortedArray(int a[]){
		
		int i =1;
		
		if(i<a.length-2 && (a[i] > a[i+1])){
			System.out.println("Array not sorted");
		}else{
			i++;
			isSortedArray(a);
		}
		
	}

}
