import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
//import BinaryTree.Node;

public class BT extends BinaryTree {

	Node root1 = null;

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

	int data;
	BT left;
	BT right;

	BT root;

	// constructor
	public BT(int data) {
		this.data = data;
		// this.left = null;
		// this.right = null;
	}

	public BT() {
		// TODO Auto-generated constructor stub
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BT getLeft() {
		return left;
	}

	public void setLeft(BT left) {
		this.left = left;
	}

	public BT getRight() {
		return right;
	}

	public void setRight(BT right) {
		this.right = right;
	}

	// void insert(int data){
	// if(root == null)
	// root = new BT(data);
	// else
	// root = insert(root,data);
	// //return;
	// }

	public void insert(int data) {
		root1 = insert(root1, data);
		// System.out.println("Data "+root.data);
	}

	public Node insert(Node node, int data) {

		if (node == null) {
			node = new Node(data);
			return node;
		} else {
			if (data <= node.data) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}
		// System.out.println("Root is "+ root.data);
		return node; // in any case, return the new pointer to the caller

	}

	public void print() {
		preOrder(root1);
	}

	public void preOrder(Node root) {

		if (root == null)
			return;
		else {
			preOrder(root.left);
			System.out.println(root.data);
			preOrder(root.right);
		}
	}

	// BT insert(BT node,int data){
	//
	// if(node ==null)
	// node = new BT(data);
	//
	// if(node.left ==null){
	// node.left = insert(node.left,data);
	// }else{
	// insert(node.left,data);
	// }
	//
	// if(root.right ==null){
	// root.right = new BT(data);
	// }else{
	// insert(root.right,data);
	// }
	//
	// return root;
	// }

	// void insert(int data){
	// root = insert(root,data);
	// //return;
	// }

	public static void Max(Node temp) {
		Queue<Node> q = new LinkedList<Node>();

		ArrayList<Node> al = new ArrayList<Node>();

		int max = Integer.MAX_VALUE;
		if (temp != null)
			q.add(temp);

		while (!q.isEmpty()) {
			Node t = q.poll();
			al.add(t);
			if (t.data < max)
				max = t.data;

			if (t.left != null)
				q.add(t.left);
			if (t.right != null)
				q.add(t.right);
		}

		System.out.println("Maximum -" + max);
		System.out.println("Last node" + al.get(al.size() - 1).data);

	}

	/* Given a binary tree, print its nodes in inorder */
	static int ctr;

	static void printInorder(Node root2, int k) {
		if (root2 == null)
			return;

		/* first recur on left child */
		printInorder(root2.left, k--);

		if (k == 0) {
			/* then print the data of node */
			System.out.print(root2.data + " ");
			return;
		}

		/* now recur on right child */
		printInorder(root2.right, k--);
	}

	public int height(Node temp) {
		if (temp == null)
			return 0;
		else {
			int l = height(temp.left);
			int r = height(temp.right);

			if (l > r)
				return l + 1;
			else
				return r + 1;
		}

	}

	int ctr1=0;
	public int Find(Node temp) {
		
		if(temp == null)
			return 0;
		if ((temp.left != null && temp.right == null) || (temp.left == null && temp.right != null))
			ctr1++;

		ctr1+= Find(temp.left) +Find(temp.right);
		return ctr1;
	}

	public static void main(String args[]) {
		BT tree = new BT();
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		

		// printInorder(bt1.root,3);
		System.out.println("----------------------------------");
		tree.preOrder(tree.root1);
		System.out.println("----------------------------------");
		System.out.println(tree.height(tree.root1));
		
		System.out.println("----------------------------------");
		
		System.out.println(tree.Find(tree.root1));
		
	}
}
