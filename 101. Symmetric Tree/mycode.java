class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isSame(root.left, root.right);
    }

    public boolean isSame(TreeNode q,TreeNode p){
        if(q==null&&p==null) return true;
        if(q==null||p==null) return false;
        if(q.val!=p.val) return false;
        return isSame(q.left,p.right)&&isSame(q.right,p.left);
    }
}

//这题也太简单了，参考上一题二叉树比较，稍微变一下即可
