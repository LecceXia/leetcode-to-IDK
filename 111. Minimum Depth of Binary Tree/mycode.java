class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        return (left==0||right==0)?left+right+1:1+Math.min(left,right);
    }
}

//注意考虑[1,2]这种情况，即left=0或者right=0
