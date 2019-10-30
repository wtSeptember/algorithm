package LeetCode.LinkedList.反转链表;

import LeetCode.LinkedList.ListNode;
//递归思想
public class Solution {
    public static ListNode reverseList(ListNode head ){
        if(head==null||head.next==null)
            return head;
        ListNode newList=reverseList(head.next);
        //找到newList的链尾元素
        ListNode move=newList;
        while (move.next!=null)
            move=move.next;
        move.next=head;
        head.next=null;
        return  newList;
        /*ListNode next=head.next;
        next.next=head;
        head.next=null;
        return newList;*/
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        ListNode head=new ListNode(arr);
        System.out.println( reverseList(head));
    }

}
