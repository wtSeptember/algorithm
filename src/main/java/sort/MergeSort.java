package sort;

import com.sun.javafx.image.BytePixelSetter;
public class MergeSort {
    public static int[] mergeSort(int[] arr){
        sort(arr, 0, arr.length-1);
        return arr;

    }
    private static void sort(int[] arr, int left, int right){
        if (left>=right){
            return;
        }

        int center=(left+right)/2;
        //对左边数组进行递归
        sort(arr, left, center);
        //对右边数组进行递归
        sort(arr, center+1, right);
        //合并
        merge(arr, left, center, right);

    }
    private static void merge(int[] arr, int left, int center, int right){
        //创建临时数组
        int[] tempArr=new int[arr.length];
        int mid=center+1;
        //记录临时数组起始索引,不然后面执行的排序会覆盖前面已经排序好的
        int temp=left;
        //从两个数组中选出小的放到临时数组中去，
        while (left<=center && mid<=right){
            if (arr[left]<=arr[mid]){
                    tempArr[temp]=arr[left];
                    left++;
                    temp++;
            }else {
                tempArr[temp]=arr[mid];
                mid++;
                temp++;
            }

        }
        //当两个数组中有一个数组中元素已经全部比较完了，将另一个数组中剩下元素全部放到临时数组
        while (left<=center){
            tempArr[temp]=arr[left];
            temp++;
            left++;
        }
        while (center<=right){
            tempArr[temp]=arr[mid];
            temp++;
            mid++;
        }
        //将临时数组中元素拷贝到元数组
        while (temp<right){
            arr[temp]=tempArr[temp++];
        }

    }
}
