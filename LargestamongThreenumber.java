import java.util.*;
public class LargestamongThreenumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number :");
        int a=sc.nextInt();
        System.out.println("Enter Sceond number :");
        int b=sc.nextInt();
        System.out.println("Enter third number :");
        int c=sc.nextInt();
        if(a>b){
            System.out.println("a is greatest");
            if(a<b){
                System.out.println("bis greatest");
            }if(a<c){
                System.out.println("c is greatest");
            }
        }
    }
}