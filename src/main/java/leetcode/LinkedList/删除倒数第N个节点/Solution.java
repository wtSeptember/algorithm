package leetcode.LinkedList.删除倒数第N个节点;

import leetcode.LinkedList.ListNode;

public class Solution {
    public static ListNode delete(ListNode head,int n){
        //先创建一个哑结点
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        //创建第一个节点,变量first引用头结点head，移动first来遍历链表得到链表的长度
        ListNode first=head;
        int length=0;
        while(first!=null){
           length++;
           first=first.next;
        }
        length=length-n;
        first=dummy;
        while(length>0){
            length--;
            first=first.next;
        }
        first.next=first.next.next;
        return dummy.next;

    }

    public static void main(String[] args) {
        double d=34.4;
        long l=499;
        int[] arr={1,2};
        ListNode head=new ListNode(arr);
        System.out.println("原来的链表："+head.toString());
        System.out.println( "删除后的链表："+ delete(head,2));
    }
}
