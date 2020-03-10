
public class MergeSort {
	
	public static void main(String[] args) {
		int a [] = {12, 11, -13, 5, -6, 7};
		
		Divide(a,0,a.length-1);
		for(int i=0;i<=a.length-1;i++)			
			System.out.println(a[i]);
	}
	
	public static void Divide(int a[],int l,int h){
		if(l<h){
			int mid = l+(h-l)/2;
			Divide(a,l,mid);
			Divide(a,mid+1,h);
			MergeSort(a,l,mid,h);
		}
	}
	
	public static void MergeSort(int a[],int l,int mid,int h){
		  
		int i = l;
	    int j = mid + 1;
	    int k = l;
	    int[] b= new int[a.length];
	    for (int p = l; p <= h; p++) {
            b[p] = a[p];
        }			
		    
	    while(i<=mid && j<=h){
	    	if(b[i] <=b[j]){
	    		a[k] = b[i];
	    		i++;
	    	}else{
	    		a[k] = b[j];
	    		j++;
	    	}
	    	k++;
	    }
	    
	    while(i<=mid){
	    	a[k] = b[i];
	    	k++;
	    	i++;
	    }
	    
	    while (j <= h) {
            a[k] = b[j];
            k++;
            j++;
        }
	}
}
