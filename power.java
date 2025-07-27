public class power {
   public static int printdec(int a,int b){
    if(b==0)
    return 1;
    return a*printdec(a,b-1);
   }
   public static void main(String[] args) {
    int a=2,b=5;
    System.out.println(printdec(a,b));
   }
}