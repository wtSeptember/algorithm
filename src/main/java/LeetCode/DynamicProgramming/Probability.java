package LeetCode.DynamicProgramming;
//求n个saizi的点数为s的概率
public class Probability {
    static void printProbability(int number){
        if (number<1)
            return;
        int g_maxValue = 6;
        int[][] pProbabilitys = new int[2][g_maxValue * number + 1];
        int flag = 0; // 控制在2个数组间切换
        // 一个骰子时
        for (int i = 1; i <= g_maxValue; i++)
            pProbabilitys[flag][i] = 1;
        // 开始加骰子
        for (int k = 2; k <= number; k++) {
            // 不可能出现的次数标记为0
            for (int i = 0; i < k; i++)
                pProbabilitys[1-flag][i] = 0;
            // 可能出现的次数
            for (int i = k; i <= g_maxValue*number; i++) {
                pProbabilitys[1-flag][i] = 0;
                for (int j = 1; j <= i && j <= g_maxValue; j++)
                    pProbabilitys[1-flag][i] += pProbabilitys[flag][i-j];
            }
            flag = 1-flag;
        }
        double total = Math.pow(g_maxValue, number);
        for (int i = 1; i <= g_maxValue*number; i++) {
            double ratio = pProbabilitys[flag][i] / total;
            System.out.println(i + ": " + ratio);
        }
    }

    public static void main(String[] args) {
        printProbability(4);
    }
}
