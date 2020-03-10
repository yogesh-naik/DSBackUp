import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collections;

public class TestA {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

		Square a = new Square();
		a.x = 2;
		a.y = 3;
		
		a.Area();
		
		
//		Square b = new Square(6);
//		b.Area();
//		
//		Square c = new Square(5,2);
//		c.Area();
		
		Queue<Object> priorityQueue = new PriorityQueue<Object>();
		priorityQueue.add(33);
		priorityQueue.add(3);
		priorityQueue.add(5);
		
		while(!priorityQueue.isEmpty()){
			System.out.println(priorityQueue.remove());
		}
		
	}

}
