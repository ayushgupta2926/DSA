public class increasing {
    public static void printdec(int[] a,int i){
        if(i==a.length)
        return;
        System.out.print(a[i]+" ");
        printdec(a,i+1);
    }
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        printdec(a,0);
    }
}
