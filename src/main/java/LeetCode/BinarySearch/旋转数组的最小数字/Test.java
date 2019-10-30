package LeetCode.BinarySearch.旋转数组的最小数字;

public class Test {
    public static int finMin(int[] arr){
        int l=0,h=arr.length-1;
        while(l<h){
            int mid=(l+h)/2;
            if(arr[mid]<arr[h])
                h=mid;
            else
                l=mid+1;
        }
        return arr[l];
    }

    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(finMin(arr));
    }
}

