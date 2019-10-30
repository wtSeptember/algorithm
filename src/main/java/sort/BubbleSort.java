package sort;

import java.util.Arrays;

/*通过从左到右不断交换相邻逆序的相邻元素，在一轮的交换之后，可以让未排序的元素上浮到右侧。

        在一轮循环中，如果没有发生交换，就说明数组已经是有序的，此时可以直接退出。

        所以一趟排序下来 就可以在最右边得到最大值
        还有就是如果一趟下来之后元素都没有发生交换，那么说明元素本来就是有序的
        */
public class BubbleSort {
    public static int[] bulleSort(int[] arr){
        for (int i=arr.length-1;i>0;i--){
            boolean swapped=false;
            for (int j=0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    swapped=true;
                }

            }
            if (!swapped)
                return arr;
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
        int[] res=bulleSort(arr);
        System.out.println(Arrays.toString(res));
    }
}
