package UseIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorObject {

	private Object[] p= {"String",112,'f',new A("255")};
	
	public class A{
		private String p;
		A(String p){
			this.p=p;
		}
		
		public String toString(){
			System.out.println("Number is- "+p);
			return p;
		}
	}
	
	public Iterator<Object> get(){
		List<Object>li = new ArrayList<Object>();
		for(Object ob : p){
			li.add(ob);
		}
		return li.iterator();
		
	}
	
	public void display(Iterator<Object> it){
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

	public List<Object> show(){
		List<Object>li = new ArrayList<Object>();
		for(Object ob : p){
			li.add(ob);
		}
		return li;
	}

}
