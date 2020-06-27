class Solution {
    private boolean result=true; 

    public boolean isBalanced(TreeNode root) {
        maxdepth(root);
        return result;
    }

    public int maxdepth(TreeNode root){
        if(root==null) return 0;
        int left=maxdepth(root.left);
        int right=maxdepth(root.right);
        if(Math.abs(left-right)>1){
            result=false;
        }
        return 1+Math.max(left,right);
    }
}

//本题需要注意理解题意
From the problem description,

a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Below is a representation of the tree input: {1,2,2,3,3,3,3,4,4,4,4,4,4,#,#,5,5}:

        ____1____
       /         \
      2           2
     /  \        / \
    3    3      3   3
   /\    /\    /\
  4  4  4  4  4  4 
 /\
5  5
Let's start with the root node (1). As you can see, left subtree's depth is 5, while right subtree's depth is 4.   
Therefore, the condition for a height-balanced binary tree holds for the root node.   
We continue the same comparison recursively for both left and right subtree,   
and we conclude that this is indeed a balanced binary tree.
