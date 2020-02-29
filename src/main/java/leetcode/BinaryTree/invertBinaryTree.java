package leetcode.BinaryTree;
//翻转二叉树，左右孩子交换位置
public class invertBinaryTree {
    public TreeNode invertTree(TreeNode root){
        if(root==null)
            return null;
        //先记录left指针，后序操作会破坏left指针，导致找不到
        TreeNode left=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(left);
        return root;
        }
    }

