package leetcode.LinkedList.分隔链表;

import leetcode.LinkedList.ListNode;

public class Solution {
    public static ListNode[] splitList(ListNode head,int k){
        //先求出链表长度
        //设置first指针来遍历链表
        ListNode first=head;
        int length=0;
        while(first!=null){
           ++length;
           first=first.next;

        }
        //将链表分为k组，每组元素n=length/k,如果不能整除，按照题意，后一组总是比前一组多一个
        int n=length/k;
        int left=length%k;
        //创建ListNode数组
        ListNode[] re=new ListNode[k];
        //设置记录每组链表链尾的指针
        ListNode tail=null;
        //设置指向头结点的指针
        ListNode pNode=head;
        for(int i=0;i<k && pNode!=null;i++){
            re[i]=pNode;
            int step=n;
            if(left>0){
                left--;
                step++;

            }
            for(int j=0;j<step;j++){
                tail=pNode;
                pNode=pNode.next;
            }
            tail.next=null;
        }
        return  re;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        ListNode head=new ListNode(arr);
        ListNode[] re=splitList(head,4);
        for(ListNode a:re){
            System.out.println(a.toString());
        }
    }
}
