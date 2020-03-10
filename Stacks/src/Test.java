import java.util.Stack;
import java.util.Stack.*;
public class Test {

	static Stack s1 = new Stack();
	static Stack s2 = new Stack();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.Enque(1);
		t1.Enque(2);
		t1.Enque(3);
		
		System.out.println(t1.deQue());
		System.out.println(t1.deQue());
	}
	
	public void Enque(int x){
		s1.push(x);
	}
	
	public int deQue(){
		int p = 0;

		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				int x = (Integer) s1.pop();
				s2.push(x);
			}
		}
		if(!s2.isEmpty()){
			p=(Integer) s2.pop();
		}
		return p;
	}

}
