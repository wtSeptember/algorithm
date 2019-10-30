package sort;

import jdk.nashorn.internal.parser.Lexer;

/*算法思想：
       * 基于分治的思想，是冒泡排序的改进型。首先在数组中选择一个基准点（该基准点的选取可能影响快速排序的效率，后面讲解选取的方法），然后分别从数组的两端扫描数组，设两个指示标志（lo指向起始位置，hi指向末尾)，首先从后半部分开始，如果发现有元素比该基准点的值小，就交换lo和hi位置的值，然后从前半部分开始扫秒，发现有元素大于基准点的值，就交换lo和hi位置的值，如此往复循环，直到lo>=hi,然后把基准点的值放到hi这个位置。一次排序就完成了。以后采用递归的方式分别对前半部分和后半部分排序，当前半部分和后半部分均有序时该数组就自然有序了。
       * 快速排序最好的情况下是每次都正好能将数组对半分，这样递归调用次数才是最少的。这种情况下比较次数为 CN=2CN/2+N，复杂度为 O(NlogN)。

最坏的情况下，第一次从最小的元素切分，第二次从第二小的元素切分，如此这般。因此最坏的情况下需要比较 N2/2。为了防止数组最开始就是有序的，在进行快速排序时需要随机打乱数组。
   */
public class QucikSort {
    public static void qucikSort(int[] arr, int left, int right){
        if(left>=right){
            return ;
        }
        int index=partition(arr,left,right);
        qucikSort(arr, left, index-1);
        qucikSort(arr, index+1, right);


    }
    private static int partition(int[] arr, int left, int right){
        int key=arr[left];
        while (left<right){
            while (arr[right]>=key && left<right){
                right--;
            }
            arr[left]=arr[right];
            while (arr[left]<=key && left<right){
                left++;
            }
            arr[right]=arr[left];
        }
        arr[right]=key;
        return right;

    }
}
