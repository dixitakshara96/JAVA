package DSA.TREE;

import javax.swing.tree.TreeNode;

public class BST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root != null) {
            if (val == root.val) {
                return root ;
            }
            else if (val < root.val  ) {
                return searchBST(root.left, val) ;
            }
            else if (val > root.val) {
                return searchBST(root.right, val);
            }
        }
        return null;
    }

    public static void main(String[] args) {

        System.out.println("BST");
    }
    
}
