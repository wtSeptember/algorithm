package LeetCode.递归.划分K个相等的子集;

import java.util.Stack;

public class Solution {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length)
            return false;

        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        int[] pushed={1,2,3,4,5};
        int[] poped={4,5,3,2,1};
        boolean re=validateStackSequences(pushed,poped);
        System.out.println(re);
    }
}
