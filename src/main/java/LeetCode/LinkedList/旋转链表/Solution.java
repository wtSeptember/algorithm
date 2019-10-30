package LeetCode.LinkedList.旋转链表;

import LeetCode.LinkedList.ListNode;
//快慢双指针，两指针应该相差k个位子
public class Solution {
    public static ListNode rotateRight(ListNode head,int k){
        if(head==null ||k==0)
            return head;
            //创建pNode指针来循环遍历链表，找到链表的长度
        ListNode pNode=head;
        int length=0;
        while(pNode!=null){
            pNode=pNode.next;
            length++;
        }
        k=k % length;
        if(k==0)
            return head;
        //将快指针向前挪k个位子
        pNode=head;
        while(k>0){
            k--;
            pNode=pNode.next;
        }
        //创建慢指针
        ListNode pPNode=head;
        //快指针走到链表结尾，慢指针走到分割处
        while(pNode.next!=null){
            pNode=pNode.next;
            pPNode=pPNode.next;
        }
        //记录链表最后一个节点，这个节点是返回链表的头结点
        ListNode res=pPNode.next;
        pPNode.next=null;
        pNode.next=head;
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        ListNode head=new ListNode(arr);
        System.out.println(rotateRight(head,3));
    }

}
