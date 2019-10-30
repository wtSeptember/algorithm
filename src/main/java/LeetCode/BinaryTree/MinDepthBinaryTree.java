package LeetCode.BinaryTree;
//根节点到最短叶子结点路径
public class MinDepthBinaryTree {
    public static  int MinDepth(TreeNode root){
        if(root==null)
            return 0;
        return Math.min(MinDepth(root.left),MinDepth(root.right))+1;
    }

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode();
        Object[] o={2, 4, 5, 7, 1, 6, 12, 32, 51, 22};

        System.out.println(MinDepth(treeNode.create(o)));
    }
}
