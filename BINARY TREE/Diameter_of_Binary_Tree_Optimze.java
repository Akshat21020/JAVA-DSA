package code;

public class Diameter_of_Binary_Tree_Optimze {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			return Diameter(root).dt;
		}
		public DaiPair Diameter(TreeNode root) {
			if(root == null) {
				return new DaiPair();
			}
			DaiPair ldp = Diameter(root.left);
			DaiPair rdp = Diameter(root.right);
			int sd = ldp.ht + rdp.ht + 2;
			DaiPair sdp = new DaiPair();
			sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
			sdp.dt = Math.max(ldp.dt, Math.max(rdp.dt, sd));
			return sdp;
		}
		class DaiPair{
			int dt = 0;
			int ht = -1;
		}
	}
}
