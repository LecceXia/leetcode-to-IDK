class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int leftMax=root.left==null?0:maxDepth(root.left);
        int rightMax=root.right==null?0:maxDepth(root.right);
        return 1+Math.max(leftMax,rightMax);
    }
}

//二叉树典型递归遍历
