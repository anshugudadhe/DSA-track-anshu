class Solution {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));

        // full path through current node
        int currentPath = left + right + root.val;

        // update global max
        maxSum = Math.max(maxSum, currentPath);

        // return one side path
        return Math.max(left, right) + root.val;
    }
}