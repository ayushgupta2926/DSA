public class decreasing {
    public static void printdec(int[] a,int i){
        if(i==a.length)
        return;
        printdec(a,i+1);
        System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        printdec(a,0);
    }
}
