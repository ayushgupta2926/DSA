import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size =sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter Index Value"+i);
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<size;j++){
            System.out.print(arr[j]);
        }
    }
}


