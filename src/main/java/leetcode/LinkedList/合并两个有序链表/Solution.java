package leetcode.LinkedList.合并两个有序链表;
import leetcode.LinkedList.ListNode;
public class Solution {

    public static  ListNode mergeTWOlists(ListNode l1,ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        if(l1.val<l2.val){
            l1.next=mergeTWOlists(l1.next,l2);
            return l1;
        }
        else{
            l2.next=mergeTWOlists(l1,l2.next);
            return l2;
        }
    }
    public static void main(String[] args) {
        int[] arr1={2,3,4};
        int[] arr2={1,3,6};
        System.out.println("两个有序链表：");
        ListNode l1=new ListNode(arr1);
        System.out.println(l1.toString());
        ListNode l2=new ListNode(arr2);
        System.out.println(l2.toString());
        System.out.println("***************");
        System.out.println("合并之后的链表：");
        System.out.println(mergeTWOlists(l1,l2));
    }
}
