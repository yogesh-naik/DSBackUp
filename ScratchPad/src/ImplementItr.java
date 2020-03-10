import java.util.ArrayList;
import java.util.Iterator;


public class ImplementItr implements Iterator<Integer> {

	private ArrayList<Integer> al = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementItr sample = new ImplementItr();
		
		sample.addElement(10);
		sample.addElement(10);
		sample.addElement(20);
		sample.addElement(30);
		
		while(sample.hasNext()){
			System.out.println(sample.next());
		}
	}

	public void addElement(int num){
		al.add(num);
	}
	
	private static int count = 0;
	private static int index =0;
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(count <=al.size()-1){
			count++;
			return true;
		}
		else
			return false;
	}


	
	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		int temp = 0;
		if(count <= al.size()){
			temp = al.get(index);
			index++;
			//return temp;
		}
		return temp;		
	}

}
