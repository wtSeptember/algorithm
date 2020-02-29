package leetcode.BinarySearch.有序数组中的单一元素;

public class Test {
    public static int Single(int[] arr){
        int l=0;
        int h=arr.length-1;
        while(l<h){
            int m=(l+h)/2;
            if(arr[m]==arr[m+1])
                l=m+2;
            else
                h=m;
        }
        return arr[l];
    }

    public static void main(String[] args) {
        int[] arr= {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(Single(arr));
    }
}