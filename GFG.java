
import java.util.*;
public class GFG {
    static int gcd(int a, int b)
    {
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("enter second number :");
        int b = sc.nextInt();
        System.out.print("GCD of " + a + " and " + b+ " is " + gcd(a, b));
    }
}
