
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {8,1,6,9,10,3,2,5,7,4};
//		HeapSort.sort(a);
//		HeapSort.show(a);
//		
		
		for (int i = a.length / 2 - 1; i >= 0; i--)
			heapify(a, a.length, i);
		//HeapSort.heapSort(a,a.length);
		HeapSort.show(a);
		System.out.println();
		int c[] = delete(a,1);		
		//HeapSort.heapSort(c,c.length);
		HeapSort.show(c);
	}
	
	public static void sort(Comparable[] pq) {
        int n = pq.length;
        for (int k = n/2 -1; k >= 1; k--) //Heapify with Highest no. on top
            sink(pq, k, n);
        
//        while (n > 1) {
//            exch(pq, 1, n--);          // Sort the heap in asending order
//            sink(pq, 1, n);
//        }
    }
	
	/**************************************************************************
    * Helper functions to restore the heap invariant.
    ***************************************************************************/

    private static void sink(Comparable[] pq, int k, int n) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(pq, j, j+1)) j++;
           if (!less(pq, k, j)) break;
           // exch(pq, k, j);
            k = j;
        }
    }
    
    /***************************************************************************
     * Helper functions for comparisons and swaps.
     * Indices are "off-by-one" to support 1-based indexing.
     ***************************************************************************/
     private static boolean less(Comparable[] pq, int i, int j) {
         return pq[i-1].compareTo(pq[j-1]) < 0;
     }

     private static void exch(int[] arr, int i, int j) {
    	 //if(arr[i] < arr[j]){
	    	 int swap = arr[i];
	         arr[i] = arr[j];
	         arr[j] = swap;
    	 //}
     }
     
  // print array to standard output
     private static void show(int[] a) {
         for (int i = 0; i < a.length; i++) {
             System.out.print(a[i] +" ");
         }
     }
     
   public static void heapify(int arr[], int n, int i)
     {
         int largest = i;  // Initialize largest as root
         int l = 2*i + 1;  // left = 2*i + 1
         int r = 2*i + 2;  // right = 2*i + 2
      
         // If left child is larger than root
         if (l < n && arr[l] > arr[largest])
             largest = l;
      
         // If right child is larger than largest so far
         if (r < n && arr[r] > arr[largest])
             largest = r;
      
         // If largest is not root
         if (largest != i)
         {
        	 exch(arr,i ,largest);      
             // Recursively heapify the affected sub-tree
             heapify(arr, n, largest);
         }
     }
      
     // main function to do heap sort
    public static void heapSort(int arr[], int n)
     {
         // Build heap (rearrange array)
//         for (int i = n / 2 - 1; i >= 0; i--)
//             heapify(arr, n, i);
      
         // One by one extract an element from heap
        while(n>1)
         {        	
             // Move current root to end
        	 exch(arr,0, --n);      
             // call max heapify on the reduced heap
             heapify(arr, n, 0);
         }
     }
    
    /*
     * Delete particular element
     */
    public static int[] delete(int [] a,int i){
    	a[i] = a[a.length-1];
    	 int l = a.length-1;
    	 a = reSize(a);
    	 //for(i=l/2-1;i>=0;i--)
    		heapify(a,l, i);
    	 
    	 return a;
    }
    public static int[] reSize(int [] a){
    	int[] b = new int[a.length-1];
    	for(int i=0;i<=a.length-2;i++){
    		b[i] =a[i];
    	}
    	
    	a = new int[b.length];
    	a=b;
    	return a;
    }

}
