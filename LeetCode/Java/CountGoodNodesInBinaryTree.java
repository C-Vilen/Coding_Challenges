/*
 * 1448. Count Good Nodes in Binary Tree
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
 * Return the number of good nodes in the binary tree.
 */
public class CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        return leafEvaluator(root, -10_000);
    }

    private int leafEvaluator(TreeNode node, int rVal){
        if(node == null) return 0;
        int output = rVal <= node.val ? 1 : 0;
        output += leafEvaluator(node.left, Math.max(rVal, node.val));
        output += leafEvaluator(node.right, Math.max(rVal, node.val));
        return output;
    }
}

class TreeNode {
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
