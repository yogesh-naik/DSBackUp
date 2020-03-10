import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test {
	public Node root = null;

	public static class Node {
		Node left;
		Node right;
		int data;

		Node(int newData) {
			this.left = null;
			this.right = null;
			this.data = newData;
		}
	}

	public static Node insertNode(Node temp, int data) {
		if (temp == null) {
			temp = new Node(data);
			return temp;
		} else if (data < temp.data) {
			temp.left = insertNode(temp.left, data);
		} else {
			temp.right = insertNode(temp.right, data);
		}
		return temp;
	}

	private static void printTree(Node node) {
		if (node == null)
			return;
		else {

			printTree(node.left);
			System.out.println(node.data);
			printTree(node.right);

		}
	}

	public int size(Node node) {

		if (node == null)
			return 0;
		// ctr++;
		int l = size(node.left);
		int p = size(node.right);

		if(l>p)
			return(l+1);
		else
			return (p+1);
		// return ctr;
		//return (l + p + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test BT = new Test();

		int array[] = { 4, 1, 2, 100, 7, 6, 8, 5, 134, 9 };
		for (int i = 0; i <= array.length - 1; i++) {
			BT.root = BT.insertNode(BT.root, (array[i]));
		}

		printTree(BT.root);
		System.out.println(BT.size(BT.root));
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(23);
		ll.add(223);
		ll.add(3);
		ll.add(-23);
		Integer [] arr = new Integer[ll.size()];
		
		ll.toArray(arr);
		System.out.println("------------");
		for(int i=0;i<=arr.length-1;i++){
			System.out.println(arr[i]);
		}
		
		Integer [] a = {3,4,5,7};
		List<Integer> al = new LinkedList<Integer>();
		al = Arrays.asList(a);
		
		System.out.println(al);
	
	}

}
