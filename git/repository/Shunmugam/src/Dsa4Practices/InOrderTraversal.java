package Dsa4Practices;

public class InOrderTraversal {
	public static void inOrder(Node root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
public static void postOrder(Node root) {
	if(root==null) return;
	postOrder(root.left);
	postOrder(root.right);
	System.out.print(root.data+" ");
}
public static void preOrder(Node root) {
	if(root==null) return;
	System.out.print(root.data+" ");
	preOrder(root.left);
	postOrder(root.right);
}
public static void main(String []args) {
	Node root=new Node(2);
	root.left=new Node(3);
	root.right=new Node(6);
	root.left.left=new Node(4);
	root.left.right=new Node(5);
	root.right.left=new Node(9);
	root.right.right=new Node(8);
	System.out.print("inorder traversal- ");
	inOrder(root);
	System.out.println();
	System.out.print("postorder traversal- ");
	postOrder(root);
	System.out.println();
	System.out.print("preorder traversal- ");
	preOrder(root);
}
}
