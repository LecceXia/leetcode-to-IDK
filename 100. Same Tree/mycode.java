class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}

//这个题目还是挺有参考价值，遇到二叉树遍历，一般都涉及到递归，写好节点的判断条件，然后递归遍历即可
