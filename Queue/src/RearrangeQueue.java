/*
 * From book DS algorithm in java 
 * problem -9
 * 
 * If input Q1 = [11,12,13,14,15,16]
 * output = 11,14,12,15,13,16
 */
public class RearrangeQueue extends Queue {

	public static void main(String[] args) {
		int arr[] = { 1, 2,3,4,5 };
		Queue q1 = new Queue();
		Queue q2 = new Queue();
		
		
		for(int i=0;i<=arr.length-1;i++)
			q1.addLast(arr[i]);
		
		int l = q1.size()/2;
		for(int i=0;i<=l-1;i++){
			int temp = q1.deleteFirst();
			q2.addLast(temp);
		}
		
		
		while(!q2.isEmpty()){
			int temp = q2.deleteFirst();
			q1.addLast(temp);
			temp = q1.deleteFirst();
			q1.addLast(temp);
			//System.out.println(q2.deleteFirst());
		}
		
		
		
		
		if(q1.size()%2 !=0){
			q1.addLast(q1.deleteFirst());
		}
		
		while(!q1.isEmpty())
			System.out.println(q1.deleteFirst());
	}
}
