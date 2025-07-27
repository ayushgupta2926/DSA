import java.util.*;
public class swap{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int a=sc.nextInt();
   System.out.println("Enter the second number"); 
    int b=sc.nextInt();
    System.out.println("Before swapping numbers are");
    System.out.println("the first number is:"+ a);
    System.out.println("the second number is :"+ b);
    int temp=a;
    a= b;
    b=temp;
    System.out.println("After swapping numbers are");
    System.out.println("the first number is:"+ a);
    System.out.println("the second number is :"+ b);
}
}
