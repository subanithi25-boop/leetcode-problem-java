/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        helpher(root, 0);
        return sum;
    }
    public void helpher(TreeNode root, int currsum){
        if(root.left == null && root.right == null){
            sum += currsum * 2 + root.val;
        }
        if(root.left != null){
            helpher(root.left, currsum * 2 + root.val);
        }
        if(root.right != null){
            helpher(root.right, currsum * 2 + root.val);
        }
    }
}