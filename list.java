import java.util.LinkedList;
public class list{
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(8);
        list.add(5,4);
        list.remove();
        System.out.println(list.get(2));
        for(int k:list)
        System.out.println(k+"");
    }
}