import java.util.*;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1= new ArrayDeque<>();
        ad1.addFirst(20);
        ad1.addLast(120);
        ad1.addLast(5520);
        ad1.addLast(8420);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.getClass());
    }
}
