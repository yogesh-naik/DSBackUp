import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Queue {
	private ArrayList<Integer> Li = new ArrayList<Integer>();

	public boolean isEmpty(){
		if(Li.isEmpty())
			return true;
		else
			return false;
	}

	public void addLast(int data){
		Li.add(data);
	}

	public int deleteFirst(){
		if(!isEmpty()){
			int temp = Li.get(0);
			Li.remove(0);
			return temp;
		}
		else
			return 0;
	}
	
	public void display(){
//		Iterator itr = Li.iterator();
//		while(itr.hasNext()){
//			System.out.println("Element from Queue-"+itr.next());
//		}
		
		for(int i=0;i<=Li.size()-1;i++)
			System.out.println(Li.get(i));
	}
}
