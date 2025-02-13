#load "Helpers/TreeNode.cs"
using System;

/**
* 104. Maximum Depth of Binary Tree
* Given the root of a binary tree, return its maximum depth.
* A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/
public class maximumDepthofBinaryTree
{
    // Runtime 0 ms beats 100%, Memory 42.26 MB beats 81.65%
    public static int MaxDepth(TreeNode root)
    {
        if (root == null) return 0;

        int left = MaxDepth(root.left);
        int right = MaxDepth(root.right);

        int depth = Math.Max(left, right) + 1;

        return depth;
    }
}

// Test the code
TreeNode nine = new TreeNode(9);
TreeNode fifteen = new TreeNode(15);
TreeNode seven = new TreeNode(7);
TreeNode twenty = new TreeNode(20, fifteen, seven);
TreeNode three = new TreeNode(3, nine, twenty);
Console.WriteLine("Example 1: Maximum depth is = " + maximumDepthofBinaryTree.MaxDepth(three));

TreeNode two = new TreeNode(2);
TreeNode one = new TreeNode(1, null, two);
Console.WriteLine("Example 2: Maximum depth is = " + maximumDepthofBinaryTree.MaxDepth(one));

Console.WriteLine("Example 3: Maximum depth is " + maximumDepthofBinaryTree.MaxDepth(null));