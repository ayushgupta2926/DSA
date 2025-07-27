import java.util.*;
public class LCMof2number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();
        int lcm = findLCM(a, b);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }
    public static int findLCM(int a, int b)
    {
        int greater = Math.max(a, b);
        int smallest = Math.min(a, b);
        for (int i = greater;; i += greater) {
            if (i % smallest == 0)
                return i;
        }
    }
}