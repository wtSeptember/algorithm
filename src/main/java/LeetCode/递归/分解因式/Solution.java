package LeetCode.递归.分解因式;

public class Solution {
    public static int factorization(int n){
        if(n<=1)
            return 1;
        int sum=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                factorization(n/i);
                sum++;
                factorization(i);
                sum++;

            }
        }
        return sum;
        }

    public static void main(String[] args) {
        int result=factorization(6);
        System.out.println(result);
    }
    }

