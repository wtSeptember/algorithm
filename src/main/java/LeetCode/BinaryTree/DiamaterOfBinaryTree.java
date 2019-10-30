package LeetCode.BinaryTree;
//二叉树任意两节点路径长度的最大值，可能会经过根节点
public class DiamaterOfBinaryTree {
    private int max=0;
    public  int solution(TreeNode root){
        depth(root);
        return max;

    }
    private  int depth(TreeNode root){
        if(root==null)
            return 0;
        int leftDepth=depth(root.left);
        int rightDepth=depth(root.right);
        //max记录当前的最大直径
        max=Math.max(max,leftDepth+rightDepth);
        //返回当前树的高度（为啥要返回当前树的高度）
        return Math.max(leftDepth,rightDepth)+1;
    }

    public static void main(String[] args) {
        Object[] o={2, 4, 5, 7, 1, 6, 12, 32, 51, 22};
        TreeNode treeNode=new TreeNode();
        DiamaterOfBinaryTree diamater=new DiamaterOfBinaryTree();
        System.out.println( diamater.solution(treeNode.create(o)));


    }
}
