class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;

        TreeNode head = helper(nums,0,nums.length-1);
        return head;
    }

    public TreeNode helper(int[] nums, int low, int high){
        if(low>high) return null;

        int mid=(high+low)/2;
        TreeNode tree = new TreeNode(nums[mid]);
        tree.left=helper(nums,low,mid-1);
        tree.right=helper(nums,mid+1,high);
        return tree;
    }
}

