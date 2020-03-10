
public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.insertFirst(7);
		l1.insertFirst(3);
		l1.insertFirst(1);
		
		LinkedList l2 = new LinkedList();
		l2.insertFirst(10);		
		l2.insertFirst(8);	
		l2.insertFirst(6);	
		l2.insertFirst(4);
		l2.insertFirst(2);
		l2.insertFirst(0);
		
		LinkedList Mer = merge(l1,l2);
		Mer.displayList();
	}
	
	static LinkedList merge(LinkedList l1 ,LinkedList l2){
		LinkedList L3 = new LinkedList();
		
		
		if(l1.isEmpty() && l2.isEmpty())
			return null;
		else{
			while(!(l1.isEmpty()) && !(l2.isEmpty())){
				int n1 = l1.getFirst();
				int n2 = l2.getFirst();
				
				if(n1 <= n2){
					L3.insertFirst(n1);
					l1.deleteFirst();//System.out.println("First is deleted "+n1+" &  "+n2);
				}
				else{
					L3.insertFirst(n2);
					l2.deleteFirst();//System.out.println("First is deleted "+n2);
				}
			 }//while loop ends
			
		}
		
	
		if(l1.isEmpty()){
			while(!l2.isEmpty()){
				int n2 = l2.deleteFirst();
				L3.insertFirst(n2);
			}
		}
		
		if(l2.isEmpty()){
			while(!l1.isEmpty()){
				int n2 = l1.deleteFirst();
				L3.insertFirst(n2);
			}
		}
		
		return L3;
		
	}
}
