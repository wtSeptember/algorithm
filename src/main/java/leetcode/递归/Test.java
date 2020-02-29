package leetcode.递归;

public class Test {
    public static int f(int n) {
        if (1 == n)
            return 1;
        else
            return n*f(n-1);
    }

    public static void main(String[] args) {
        int result=f(5);
        System.out.println(result);
    }

}
