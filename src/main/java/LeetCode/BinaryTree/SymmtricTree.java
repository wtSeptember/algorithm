package LeetCode.BinaryTree;

//判断是否是对称二叉树
public class SymmtricTree {
    public boolean isSymmtric(TreeNode root){
        if(root==null)
            return false;
        return isSymmtric(root.left,root.right);
    }
    private boolean isSymmtric(TreeNode left,TreeNode right){
        if(left.left==null && right.right==null)
            return true;
        if(left.left==null || right.right==null)
            return false;
        if(left.data==right.data)
            return true;
        return isSymmtric(left.left,right.right) && isSymmtric(left.right,right.left);
    }

}
