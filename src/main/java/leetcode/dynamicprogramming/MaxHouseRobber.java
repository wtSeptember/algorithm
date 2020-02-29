package leetcode.dynamicprogramming;
//强盗抢劫，不能抢劫相邻的房子
public class MaxHouseRobber {
    public static int robbing(int[] house){
        int[] dp=new int[house.length+1];
        dp[1]=0;
        dp[2]=0;
        for(int i=3; i<=house.length-1; i++){
            dp[i]=Math.max(dp[i-2]+house[i], dp[i-1]);
        }
        return dp[house.length-1];

    }
    public static void main(String[] args) {
        System.out.println(MaxHouseRobber.robbing(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
