package leetcode.DoublePointer;

import java.util.Arrays;

/*题目描述：
      从有序数组中找出两个数，使它们的和为target
* 解题思路：
*    使用双指针，一个指针指向值较小的元素，一个指针指向值较大的元素。指向较小元素的指针从头向尾遍历，指向较大元素的指针     从尾向头遍历
*        如果两个指针指向元素的和 sum == target，那么得到要求的结果；
         如果 sum > target，移动较大的元素，使 sum 变小一些；
         如果 sum < target，移动较小的元素，使 sum 变大一些。
*
*
* */
public class TwoSUm {
    public static int[] twoSum(int[] arr,int targer){
        int i=0,j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if (sum==targer)
                return new int[]{i+1,j+1};
            else if(sum<targer){
                i++;
            }else{
                j--;
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int[] res=twoSum(arr,9);
        System.out.println(Arrays.toString(res));
    }
}
