import java.util.*;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("This is a even number");
        }else{
            System.out.println("This is a odd number");
        }

    }
}