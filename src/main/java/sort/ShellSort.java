package sort;

import java.util.Arrays;

/* 希尔排序是直接插入排序的改良版,插入到有序元素中的待排元素不再是相邻的,而是间隔若干增量*/
public class ShellSort {
    public static int[] shellSort(int[] arr){
        int n=arr.length;
        for(int h=n/2;h>0;h=h/2){
            for(int i=h;i<n;i++){
                for(int j=i;j>=h;j=j-h){
                    if (arr[j]<arr[j-h])
                        swap(arr, j, j-h);
                }
            }
        }
        return  arr;
    }
      private static void swap(int[] arr, int i, int j){
          int t=arr[i];
          arr[i]=arr[j];
          arr[j]=t;

      }
      public static void main(String[] args) {
          int[] arr={3,44,38,54,9,15,36};

          int[] res=shellSort(arr);
          System.out.println(Arrays.toString(res));
      }

}
