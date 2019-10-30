package LeetCode.LinkedList.删除链表中的重复元素;

import LeetCode.LinkedList.ListNode;

public class Solution {
    public static ListNode deleteDupcation(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode pNode = head; //当前指针
        ListNode pPreNode = res; //当前节点的前一个不重复节点
        while (pNode != null) {
            if (pNode.next != null && pNode.val == pNode.next.val){
                while (pNode.next != null && pNode.val== pNode.next.val){
                    pNode = pNode.next;
                }
                //pNode = pNode.next; //指向被删除节点的下一个节点
                pPreNode.next = pNode;
            }else {
                pNode= pNode.next;
                pPreNode = pPreNode.next;
            }
        }
        return res.next;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4};
        ListNode head =new ListNode(arr);
        System.out.println("原链表："+head.toString());
        ListNode listNode = deleteDupcation(head);
        System.out.println(listNode);
        System.out.println("删除后的链表："+deleteDupcation(head));

    }
}
