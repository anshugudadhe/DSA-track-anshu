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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<>();
        helper(root,a);
        return a;
    }
    private void helper(TreeNode root, ArrayList<Integer> a){
        if(root==null){
            return;
        }

        a.add(root.val);
        helper(root.left,a);
        helper(root.right,a);
        return;
    }
}