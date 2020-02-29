package leetcode.LinkedList;

public class ListNode{
    public int val;
    public ListNode next;
    public ListNode(int x){

        val=x;
    }
    public ListNode(int[] arr){
        if(arr==null||arr.length==0)
            throw  new IllegalArgumentException("数组不能为空");
        ListNode cur=this;
        cur.val=arr[0];
        for(int i=1;i<arr.length;i++){
            cur.next=new ListNode(arr[i]);
            cur=cur.next;
        }
    }
    public String toString(){
        StringBuilder result=new StringBuilder();
        ListNode cur=this;
        while(cur!=null){
            result.append(cur.val+"->");
            cur=cur.next;
        }
        result.append("null");
        return result.toString();
    }

}