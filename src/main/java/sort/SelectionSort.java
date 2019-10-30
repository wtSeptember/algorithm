package sort;

import java.util.Arrays;

/*选择排序：
      思路：
        选出数组中最小元素,将它和第一个元素交换位置；再从剩下的元素中选出最小的元素，将它和数组的第二个元素交换位置
      时间复杂度：0（n2）
       */
public class SelectionSort {
    public static int[]  SelectSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j])
                    minIndex=j;
            }
            swap(arr,i,minIndex);
        }
        return arr;
    }
    private static void swap(int[] arr, int i, int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;

    }

    public static void main(String[] args) {
        int[] arr={3,44,38,54,9,15,36};

       int[] res= SelectSort(arr);
        System.out.println(Arrays.toString(res));
    }

}
