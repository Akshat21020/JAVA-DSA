package code;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class BinaryTree {
	
	class Node {
		int val;
		Node left;
		Node right;
	}
	private Node root;
	Scanner sc = new Scanner(System.in);
	
	public BinaryTree() {
		root = CreateTree();
	}
	private Node CreateTree() {
		Node nn = new Node();
		int item = sc.nextInt();
		nn.val = item;
		boolean hlc = sc.nextBoolean();
		if(hlc == true) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if(hrc == true) {
			nn.right = CreateTree();
		}
		return nn;
	}
	
	public void Display() {
		 Display(root);
	}
	private void Display(Node nn) {
		if(nn == null) {
			return;
		}
		String s = "";
		s = "<---"+s+nn.val+"--->";
		if(nn.left != null) {
			s = s + nn.left.val;
		}
		else {
			s = s +".";
		}
        if(nn.right != null) {
        	s = nn.right.val + s;
		}
		else {
			s = "." +s;
		}
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
	}
	
	public int Max() {
		return Max(root);
	}
	private int Max(Node nn) {
		if(nn == null) {
			return Integer.MIN_VALUE;
		}
		int leftmax = Max(nn.left);
		int rightmax = Max(nn.right);
		return Math.max(nn.val, Math.max(leftmax, rightmax));
	}
	
	public boolean find(int item) {
		return find(root,item);
	}
	private boolean find(Node nn,int item) {
		if(nn == null) {
			return false;
		}
		if(nn.val == item) {
			return true;
		}
		boolean l = find(nn.left,item);
		boolean r = find(nn.right,item);
		return l || r;
	}
	
	public int height() {
		return height(root);
	}
	private int height(Node nn) {
		if(nn == null) {
			return 0;
		}
		int lht = height(nn.left);
		int rht = height(nn.right);
		return Math.max(lht, rht) + 1;
	}
	
	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}
	private void PreOrder(Node nn) {
		if(nn == null) {
			return;
		}
		System.out.print(nn.val+" ");
		PreOrder(nn.left);
		PreOrder(nn.right);
	}
	
	public void INOrder() {
		INOrder(root);
		System.out.println();
	}
	private void INOrder(Node nn) {
		if(nn == null) {
			return;
		}
		INOrder(nn.left);
		System.out.print(nn.val+" ");
		INOrder(nn.right);
	}
	
	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}
	private void PostOrder(Node nn) {
		if(nn == null) {
			return;
		}
		PostOrder(nn.left);
		PostOrder(nn.right);
		System.out.print(nn.val+" ");
	}
	
	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node r = q.poll();
			System.out.print(r.val+" ");
			if(r.left != null) {
				q.add(r.left);
			}
			if(r.right != null) {
				q.add(r.right);
			}
		}
		System.out.println();
	}
}
