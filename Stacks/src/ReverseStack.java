import java.util.Stack;
public class ReverseStack {

	/*
	 * Reverse the stack using anothe stack
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> main = new Stack<Integer>();
		main.push(15);
		main.push(-2);
		main.push(5);
		main.push(1);
		reverseStack(main);
	}
	
	public static void reverseStack(Stack<Integer> main){
		Stack<Integer> st = new Stack();
		
		while(!main.isEmpty()){
			int temp = main.pop();
			while(!st.empty() && st.peek() > temp){
				main.push(st.pop());
			}
			st.push(temp);
		}
		
		System.out.println(st);
	}

}
