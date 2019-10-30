package sort;

import java.util.Arrays;

/*
* 直接插入排序从左到右进行，每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左部数组依然有序。
  第 j 元素是通过不断向左比较并交换来实现插入过程：当第 j 元素小于第 j - 1 元素，就将它们的位置交换，
  然后令 j指针向左移动一个位置，不断进行以上操作。*/
public class InsertionSort {
    public static int[] InsertSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j-1);
                else
                    break;

            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] arr={3,44,38,54,9,15,36};
        int[] res=InsertSort(arr);
        System.out.println(Arrays.toString(res));
    }
}
