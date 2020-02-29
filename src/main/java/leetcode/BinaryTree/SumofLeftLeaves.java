package leetcode.BinaryTree;
//统计左叶子结点的和
public class SumofLeftLeaves {
    public  int sum(TreeNode root){
        if (root==null)
            return 0;
        int res=0;
        if(isLeafNodes(root.left)){
           res=res+ (int)root.left.data;
           // res++;
        }else
            res=sum(root.left)+sum(root.right);
        return res;

    }
    private boolean isLeafNodes(TreeNode root){
        if (root==null)
            return false;
        return root.left==null && root.right==null;


    }
    public static void main(String[] arg){
        Object[] o={2, 4, 5, 7, 1, 6, 12, 32, 51, 22};
        TreeNode treeNode=new TreeNode();
        SumofLeftLeaves leaves=new SumofLeftLeaves();
        System.out.println(leaves.sum(treeNode.create(o)));
    }
}
