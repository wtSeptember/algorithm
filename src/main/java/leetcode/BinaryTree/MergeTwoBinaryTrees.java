package leetcode.BinaryTree;
//合并两颗二叉树，相同结构的节点数值相加
public class MergeTwoBinaryTrees {
    public TreeNode merger(TreeNode t1,TreeNode t2){
        if(t1==null&t2==null)
            return null;
        if(t1==null)
            return t2;
        if(t2==null)
            return t1;
        TreeNode root=new TreeNode((int)t1.data+(int)t2.data);
        root.left=merger(t1.left,t2.left);
        root.right=merger(t1.right,t2.right);
        return  root;
    }
}
