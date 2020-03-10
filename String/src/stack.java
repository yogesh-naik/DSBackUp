import java.util.LinkedList;


public class stack {

	LinkedList<Integer>LL = new LinkedList<Integer>();
	
	public void push(int i){
		LL.add(i);
	}
	
	public int pop(){
		int temp = LL.getLast();
		LL.removeLast();
		return temp;
	}
	
	public void display(){
		for(int i=LL.size()-1;i>=0;i--)
			System.out.println(LL.get(i));
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stack st = new stack();
		
		//Add 5 elements in Stack
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		//pop 2 elements
		st.pop();
		st.pop();
		
		//Display stack 
		st.display();
	}

}
