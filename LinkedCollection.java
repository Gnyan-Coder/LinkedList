import java.util.*;
public class LinkedCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.addFirst(1);
        list.addFirst(2);
        System.out.println(list);
        list.addLast(10);
        list.addLast(20);
        System.out.println(list);
        
    }
}
