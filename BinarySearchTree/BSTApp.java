package BinarySearchTree;

public class BSTApp {
	
	public static boolean search(Node root, int data) {
		if(root == null) return false;
		
		if(root.data == data) return true;
		
		if(root.data < data) {
			search(root.left, data);
		} else {
			search(root.right, data);
		}
		
		return false;
	}
	
	public static int getMin(Node root) {
		if(root == null) {
			System.out.println("Empty tree");
			return -1;
		}
		
		Node temp = root;
		
		while(temp.left != null) {
			temp = temp.left;
		}
		
		return temp.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bst tree = new bst();
		
		tree.insert(8);
		tree.insert(3);
		tree.insert(10);
		tree.insert(1);
		tree.insert(6);
		tree.insert(14);
		tree.insert(4);
		tree.insert(7);
		tree.insert(13);
		
		System.out.println(search(tree.root, 8));
		System.out.println(search(tree.root, 5));
		
		System.out.println(getMin(tree.root));
	}

}
