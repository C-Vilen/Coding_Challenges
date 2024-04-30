/**
 * 104. Maximum Depth of Binary Tree
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class maximumDepthofBinaryTree {
    // Runtime 0 ms beats 100%, Memory 42.26 MB beats 81.65%
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int depth = Math.max(left , right) + 1;

        return depth;
    }


    public static void main(String[] args) {
        TreeNode nine = new TreeNode(9);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode three = new TreeNode(3, nine, twenty);
        System.out.println("Example 1: Maximum depth is = " + maxDepth(three));

        TreeNode two = new TreeNode(2);
        TreeNode one = new TreeNode(1, null, two);
        System.out.println("Example 2: Maximum depth is = " + maxDepth(one));

        System.out.println("Example 3: Maximum depth is " + maxDepth(null));
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