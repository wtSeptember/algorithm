package leetcode.BinarySearch.大于给定元素的最小元素;

public class Test {
    public static char test(char[] arr,char target){
        int n=arr.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            if (arr[m]<=target)
                l=m+1;
            else
                h=m-1;
        }
        return l<n ? arr[l]:arr[0];
    }

    public static void main(String[] args) {
        char[] arr={'a','b','d','e'};
        char target='c';
        System.out.println(test(arr,target));
    }
}
