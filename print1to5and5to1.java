import java.util.*;
public class print1to5and5to1 {
    static void printdec(int n){
        if(n==0)
        return;
        System.out.println(n);
        printdec(n-1);
        System.out.println(n);
    }
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        printdec(n);
    }
}
