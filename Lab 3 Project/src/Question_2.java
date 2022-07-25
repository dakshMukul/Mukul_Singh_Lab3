import java.util.HashSet;
import java.util.Set;

public class Question_2 {

	//Find a pair with a given sum in Binary Search tree
	
	class Findsumpair
	{
		class Node{
			private Node left;
			private Node right;
			private int data;
			
			Node(){
				left=right=null;
			}
			
		}
		static Node newNode(int data) {
			Node temp = new Node();
			temp.data= data;
		}
		
		public Node insert(Node root, int key) {
			if(root==null)
				return NewNode(key);
			if(key<root.data) {
				root.left = insert(root.left,key);
			}
			else {
				root.right = insert(root.right,key);
			}
			return root;
		}
		public boolean findPair(Node root, int sum, Set<E> set)
		{
			if(root == null)
				return false;
			else {
				boolean isPresent = findPair(root.left,sum,set);
				if(isPresent) {
					return isPresent;
				}
				if(set.contains(sum-root.data)) {
					System.out.println("The pair exists with the values of " + sum-root.data + ", "root.data); 
					return isPresent;
				}
			}
			
		}
		
		public static void findPairWithGivenSum(Node root, int sum) 
		{
			Hashset<Integer> set = new HashSet<Integer>();
			boolean isPresent = findPair(root,sum,set);
			if(!isPresent) {
				System.out.println("Pair does not exits");
			}
		}
	}
	public static void main(String[] args) {
		Node root = null;
	    Findsumpair findsumpair = new Findsumpair();
	    root = findsumpair.insert(root,40);
	    root = findsumpair.insert(root,20);
	    root = findsumpair.insert(root,60);
	    root = findsumpair.insert(root,10);
	    root = findsumpair.insert(root,30);
	    root = findsumpair.insert(root,50);
	    root = findsumpair.insert(root,70);
	    
	    
		System.out.println(findPairWithGivenSum(root,sum));
	}

}
