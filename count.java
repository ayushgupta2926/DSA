public class count {
    public static void main(String[] args){
        int x=12345;
        while(x!=0){
            int digit=x%10;
            if(digit==5){
                System.out.println(digit);
            }
            x=x/10;
        }
    }
}
