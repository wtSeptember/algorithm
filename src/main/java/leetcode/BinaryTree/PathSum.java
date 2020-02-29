package leetcode.BinaryTree;
//判断路径和是否等于一个数
public class PathSum {
    public boolean isExist(TreeNode root,int target){
        if(root==null)
            return false;

        if(isLeafNodes(root) && (int)root.data==target)
            return true;
        return isExist(root.left,target-(int)root.data) || isExist(root.right,target-(int)root.data);


    }
    private boolean isLeafNodes(TreeNode root){
        if (root==null)
            return false;
        return root.left==null && root.right==null;
}

    public static void main(String[] args) {
        Object[] o={2, 4, 5, 7, 1, 6, 12, 32, 51, 22};
        TreeNode treeNode=new TreeNode();
        PathSum pathSum=new PathSum();
        System.out.println(pathSum.isExist(treeNode.create(o),14));
    }

}
