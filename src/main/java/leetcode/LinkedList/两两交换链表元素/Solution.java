package leetcode.LinkedList.两两交换链表元素;

import leetcode.LinkedList.ListNode;

public class Solution {
    public  static ListNode swap(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode next=head.next;
        head.next=swap(next.next);
        next.next=head;
        return next;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        ListNode head=new ListNode(arr);
        ListNode result=swap(head);
        System.out.println(result.toString());
    }
}
