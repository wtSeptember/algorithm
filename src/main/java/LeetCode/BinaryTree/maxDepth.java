package LeetCode.BinaryTree;

//二叉树高度
public class maxDepth {
    public  static int solution(TreeNode root){
        if(root==null)
            return 0;
        return Math.max(solution(root.left),solution(root.right))+1;
    }

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode();
        Object[] o={2, 4, 5, 7, 1, 6, 12, 32, 51, 22};
        System.out.println(solution(treeNode.create(o)));


    }

}
