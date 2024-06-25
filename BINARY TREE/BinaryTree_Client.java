package code;

public class BinaryTree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
		bt.Display();
		System.out.println(bt.Max());
		System.out.println(bt.find(40));
		System.out.println(bt.height());
		bt.PreOrder();
		bt.INOrder();
		bt.PostOrder();
		bt.LevelOrder();

	}

}
