import java.util.ArrayList;
import java.util.List;

/**
 * 872. Leaf-Similar Trees
 * Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
 * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 */

public class leafSimilarTrees {
    public boolean LeafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        findLeafsDFS(root1, leaf1);
        findLeafsDFS(root2, leaf2);

        return leaf1.equals(leaf2);
    }

    private void findLeafsDFS(TreeNode root, List<Integer> leafs) {
        if (root == null) return;
        if (root.left == null && root.right == null) leafs.add(root.val);
        findLeafsDFS(root.left, leafs);
        findLeafsDFS(root.right, leafs);
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