import java.util.Stack;

public class BinaryTree {
	// Root node pointer. Will be null for an empty tree.
	public Node root = null;

	// This method mainly calls deleteRec()
	void deleteKey(int key) {
		root = deleteRec(root, key);
	}

	/* A recursive function to delete record in BST */
	Node deleteRec(Node root, int key) {
		/* Base Case: If the tree is empty */
		if (root == null)
			return root;

		/* Otherwise, recur down the tree */
		if (key < root.data)
			root.left = deleteRec(root.left, key);
		else if (key > root.data)
			root.right = deleteRec(root.right, key);

		// if key is same as root's key, then This is the node
		// to be deleted
		else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder successor (smallest in
			// the right subtree)
			root.data = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteRec(root.right, root.data);
		}

		return root;
	}

	int minValue(Node root) {
		int minv;
		while (root.left != null) {
			minv = root.left.data;
			root = root.left;
		}

		return root.data;
	}

	/*
	 * --Node-- The binary tree is built using this nested node class. Each node
	 * stores one data element, and has left and right sub-tree pointer which
	 * may be null. The node is a "dumb" nested class -- we just use it for
	 * storage; it does not have any methods.
	 */
	public static class Node {
		Node left;
		Node right;
		int data;

		Node(int newData) {
			this.left = null;
			this.right = null;
			this.data = newData;
		}

		boolean isLeaf() {
			return left == null ? right == null : false;
		}

		// Read more:
		// http://www.java67.com/2016/10/how-to-print-leaf-nodes-of-binary-tree-without-recursion-in-java.html#ixzz4NVmVzms1
	}

	/**
	 * Creates an empty binary tree -- a null root pointer.
	 */
	// public void BinaryTree() {
	// root = null;
	// }

	/**
	 * Returns true if the given target is in the binary tree. Uses a recursive
	 * helper.
	 */
	public boolean lookup(int data) {
		boolean p = lookup(root, data);
		return p;
	}

	/**
	 * Recursive lookup -- given a node, recur down searching for the given
	 * data.
	 */
	private boolean lookup(Node node, int data) {
		if (node == null) {
			return (false);
		}

		if (data == node.data) {
			return (true);
		}
		// } else if (data < node.data) {
		// return lookup(node.left, data);
		// } else {
		// return lookup(node.right, data);
		// }
		else {
			return (lookup(node.left, data) || lookup(node.right, data));
		}
	}

	/**
	 * Inserts the given data into the binary tree. Uses a recursive helper.
	 */
	public void insert(int data) {
		root = insert(root, data);
		// System.out.println("Data "+root.data);
	}

	/**
	 * Recursive insert -- given a node pointer, recur down and insert the given
	 * data into the tree. Returns the new node pointer (the standard way to
	 * communicate a changed pointer back to the caller).
	 */
	private Node insert(Node node, int data) {
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
		// System.out.println("Root is "+ node);
		return node; // in any case, return the new pointer to the caller
	}

	public void printTree() {
		printTree(root);
		// System.out.println();
	}

	private void printTree(Node node) {
		if (node == null)
			return;
		else {

			printTree(node.left);
			System.out.println(node.data);
			printTree(node.right);

		}
		// return root;
	}

	/*
	 * Find Max element in the tree
	 */

	public int Max_BST() {
		return Max_BST(root);
	}

	int max = Integer.MIN_VALUE;

	public int Max_BST(Node node) {
		// Node node = root;

		if (node == null)
			return max;
		else {
			int temp = node.data;
			int left = Max_BST(node.left);
			int right = Max_BST(node.right);

			if (left > right)
				max = left;
			else
				max = right;
			if (temp > max)
				max = temp;
		}
		return max;

	}

	public int Min_BST() {
		int p = Min_BST(root);
		return p;
	}

	public int Min_BST(Node temp) {

		int t, l, r;

		if (temp == null)
			return Integer.MAX_VALUE;

		int rs = temp.data;
		l = Min_BST(temp.left);
		r = Min_BST(temp.right);

		if (l < r)
			t = l;
		else
			t = r;
		if (rs < t)
			t = rs;

		return t;

	}

	void display() {
		System.out.println("ROOT" + root.data);
	}

	// Find the size of Tree = number of elements in TREE
	int ctr = 0;

	public int size(Node node) {

		if (node == null)
			return ctr;
		// ctr++;
		int l = size(node.left);
		int p = size(node.right);

		// return ctr;
		return (l + p + 1);
	}

	public int size() {
		return size(root);
	}

	public int height() {
		return height(root);
	}

	// Insert Metdod from BOOK - Narshimha

	public void insertBST1(Node root, int data) {
		if (root == null)
			root = new Node(data);
		else
			insertBST(root, data);
	}

	public Node insertBST(Node root, int data) {
		if (root.left == null)
			root.left = new Node(data);
		else {
			root.right = insertBST(root.right, data);
		}

		if (root.right == null)
			root.right = new Node(data);
		else {
			root.left = insertBST(root.left, data);
		}
		return root;
	}

	// Find Depth of the node
	int height(Node node) {

		if (node == null)
			return 0;

		int sum1 = 0, sum2 = 0;
		int ldepth = height(node.left); // sum1 =sum1+node.data;
		int rdepth = height(node.right);// sum2=sum2+node.data;

		// System.out.println("sum1 "+sum1);

		if (ldepth > rdepth)
			return ldepth + 1;
		else
			return rdepth + 1;
	}

	// Find if 2 trees are same
	public static boolean sameTree(Node node1, Node node2) {

		if (node1 == null && node2 == null)
			return true;
		if (node1 == null || node2 == null)   // ?? is this condition needed
			return false;
		if (node1.data != node2.data) {
			System.out.println("Here is breaking " + node1.data + " ** " + node2.data);
			return false;
		} else {
			return (sameTree(node1.left, node2.left) && sameTree(node1.right, node2.right));
		}
	}


	// sum of all elements in Binary Tree
	private static int sum = 0;

	public static int sumofBinaryTree(Node node) {

		if (node == null)
			return 0;
		else {
			sum = sum + node.data;
			sumofBinaryTree(node.left);
			sumofBinaryTree(node.right);
		}
		return sum;
	}

	public void BST() {
		boolean fal = false;
		System.out.println("The flag is " + fal);
		fal = isBST(root);
		System.out.println("The flag is " + fal);
	}

	public boolean isBST(Node temp) {
		if (temp == null)
			return false;
		if ((temp.left != null && temp.data < temp.left.data) || (temp.right != null && temp.data > temp.right.data))
			return false;
		else {
			isBST(temp.left);
			isBST(temp.right);
		}
		return true;
	}

	// Google Q -
	/*
	 * Count number of nodes where all subtrees are lies in range
	 */
	static int count = 0;

	public static int Range(Node node, int low, int high) {

		if (node == null)
			return 0;
		if (node.data > low && node.data < high)
			count++;
		Range(node.left, low, high);
		Range(node.right, low, high);

		return count;
	}

	/* function to print level order traversal of tree */
	void printLevelOrder() {
		int h = height(root);
		int i;
		// for (i = 1; i <= h; i++) {
		printGivenLevel(root, 3);
		System.out.println("");
		// }
	}

	/* Print nodes at the given level */
	void printGivenLevel(Node temp, int level) {
		if (temp == null)
			return;
		if (level == 1) {
			System.out.print(temp.data + " ");
			// st.push(temp.data);
			// System.out.println(st.pop());
		} else if (level > 1) {
			printGivenLevel(temp.left, level - 1);
			printGivenLevel(temp.right, level - 1);
			// System.out.println();
		}

	}

	public boolean isBalanced(Node temp) {

		if (temp == null) {
			return false;
		}

		int l = height(temp.left); // sum1 =sum1+node.data;
		int r = height(temp.right);

		System.out.println("left side" + l);
		System.out.println("Right side" + r);

		if ((l - r) > 1)
			return false;
		if ((r - l) > 1)
			return false;
		else
			return true;
	}

	public int Diameter(Node temp) {
		int left, right, diameter = 0;
		if (temp == null)
			return 0;

		int l1 = height(temp.left) + height(temp.right)+1;

		// left = Diameter(temp.left);
		// right = Diameter(temp.right);

		int l2 = Math.max(Diameter(temp.left), Diameter(temp.right));

		return Math.max(l1, l2);
	}

	// Print tree without recursion

	public static void printLeaf(Node root)

	{
		if (root == null)
			return;

		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			if (node.left != null) {
				stack.add(node.left);
			}

			System.out.println(node.data);
			if (node.right != null) {
				stack.add(node.right);
			}
		}
	}

	public static int size2(Node temp) {
		if (temp == null)
			return 0;

		int l = size2(temp.left);
		int r = size2(temp.right);

		return (l + r + 1);
	}


	public static void main(String args[]) {

		Node t = new Node(-100);

		BinaryTree bt = new BinaryTree();
		BinaryTree bt1 = new BinaryTree();

		int array[] = { 4, 1, 2, 100, 7, 6, 5, 134 };
		for (int i = 0; i <= array.length - 1; i++) {
			bt.insert(array[i]);
		}

		for (int i = 0; i <= array.length - 1; i++) {
			bt1.insert(array[i]);
		}

		System.out.println("------Print BT-------");
		bt1.printTree();
		System.out.println("------Print-------");
		System.out.println("HERE --" + sameTree(bt.root, bt1.root));
		// bt.deleteKey(7);
		// bt.printTree();
		System.out.println("No of elements >" + bt.size2(bt.root));
		//
		// //System.out.println("depth "+bt.height());
		System.out.println("-------Lookup--------");
		boolean tp = bt.lookup(12);
		System.out.println(tp);
		// System.out.println("-------Lookup--------");
		int p = bt.Max_BST();
		System.out.println(p);
	
		System.out.println("-------HEIGHT --------" + bt.height());
		// bt.insert(7);
		// bt.printTree();
		// bt.insert(-23);
		// bt.insert(25);
		System.out.println("Max >>> " + bt1.MAXIMUM_no(bt1.root));
		System.out.println("Max >>> " + bt1.Max_BST());
		// bt.BST();
		System.out.println("-------Balanced--------");
		System.out.println(bt.isBalanced(bt.root));
		System.out.println("-------Level order--------");
		bt.printLevelOrder();

		System.out.println("Diameter -" + bt.Diameter(bt.root));

		System.out.println("-------Without REcuriosn--------");
		bt.printLeaf(bt.root);
		System.out.println("-------sum of BT--------");
		bt1.sumofBinaryTree(bt1.root);
		System.out.println("SUM " + sum);

		BinaryTree bt3 = new BinaryTree();
		bt3.insert(2);
		bt3.insert(1);
		bt3.insert(8);
		bt3.insert(6);
		bt3.insert(4);
		bt3.insert(7);
		bt3.insert(9);
		System.out.println("--------->>>>>>>>>>>>>>>>>-------");
		System.out.println(bt3.height());
		System.out.println("--------->>>>>>>>>>>>>>>>>-------");
		//bt3.printTree();
		System.out.println(bt3.Diameter(bt3.root));
		System.out.println("--------->>>>>>>>>>>>>>>>>-------");
		bt3.printAncestors(bt3.root,9);
	}

	 int ctr1 =0;
	 //This function does not work.
	public  int HalfNodes(Node temp){
		if(temp == null)
			return 0;
		else if((temp.left == null && temp.right !=null) ||(temp.left != null && temp.right ==null)){
			ctr1++;
		}{
			int l = HalfNodes(temp.left);
			int r = HalfNodes(temp.right);
		
		return ctr1+l+r;
		}
	}
	
	
	//////
	public boolean printAncestors(Node temp,int no){
		if(temp == null)
			return false;
		if(temp.data == no)
			return true;
		
		if(printAncestors(temp.left,no) || printAncestors(temp.right,no)){
			System.out.println(temp.data);
			return true;
		}
		else
			return false;
	}
	
	/////
	static int MAX_int = Integer.MIN_VALUE;

	public static int MAXIMUM_no(Node temp) {

		if (temp == null)
			return MAX_int;

		int data = temp.data;
		if (data > MAX_int)
			MAX_int = data;
		MAXIMUM_no(temp.left);
		MAXIMUM_no(temp.right);

		return MAX_int;
	}
}