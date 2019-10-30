package 剑指Offer;
//小青蛙跳台阶
public class JumpFloor {
    //n级台阶的跳法
    public static int jumpFloor(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        return jumpFloor(n-1)+jumpFloor(n-2);
    }

    public static void main(String[] args) {
        System.out.println(jumpFloor(4));
    }
}
