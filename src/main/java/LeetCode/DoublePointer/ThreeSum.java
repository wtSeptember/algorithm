package LeetCode.DoublePointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*问题描述：
    给定一个数组，判断数组中是否存在三个元素a,b,c使得三个数之和为定值（比如为零）*/
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            //去重
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }

            int m = i + 1, n = nums.length - 1;
            while (m < n) {
                if (n<nums.length-1 && nums[n]==nums[n+1]||nums[i] + nums[m] + nums[n] > 0) {
                    n--;
                } else if (m>i+1 && nums[m]==nums[m-1]||nums[i] + nums[m] + nums[n] < 0) {
                    m++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[m++]);
                    list.add(nums[n--]);
                    result.add(list);
                }
            }
        }
        return result;
    }


}
