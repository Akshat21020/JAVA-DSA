package code;

public class Validate_Binary_Search_Tree {
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
		public boolean isValidBST(TreeNode root) {
			return ValidBST(root).isbst;
		}
		public BSTpair ValidBST(TreeNode root) {
			if (root == null) {
				return new BSTpair();
			}
			BSTpair lbp = ValidBST(root.left);
			BSTpair rbp = ValidBST(root.right);
			BSTpair sbstp = new BSTpair();
			sbstp.min = Math.min(root.val,Math.min(lbp.min, rbp.min));
			sbstp.max = Math.max(root.val,Math.max(lbp.max, rbp.max));
			sbstp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && root.val < rbp.max;
			return sbstp;
		}
		class BSTpair{
			boolean isbst = true;
			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;
		}
	}
}
