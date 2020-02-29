package leetcode.BinaryTree;
//判断t是否是s的子树
public class SubTree {
    public boolean isSubTree(TreeNode s,TreeNode t){
        if(s==null)
            return false;
        return isSubTreeRoot(s,t) || isSubTree(s.left,t) || isSubTree(s.right,t);

    }

    public boolean isSubTreeRoot(TreeNode s,TreeNode t){
        if(s==null && t==null)
            return true;
        if(s==null||t==null)
            return false;
        if(s.data==t.data)
            return true;
        return isSubTreeRoot(s.left,t.left) || isSubTreeRoot(s.right ,t.right);
    }
}
