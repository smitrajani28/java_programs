import java.util.*;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l2.add(16);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l2.add(16);
        l1.addAll(l2);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        System.out.println("------------------------------------------");
        l1.clear();
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        for (int i = 0; i < l2.size(); i++) {
            System.out.println(l2.get(i));
        }
        System.out.println("------------------------------------------");
        for (int i = 0; i < l2.size(); i++) {
            System.out.print(i);
            System.out.print(l2.contains(i+10));
            System.out.print("\n");
        }
        System.out.println("------------------------------------------");
        for (int i = 0; i < l2.size(); i++) {
            System.out.print(i + " -> ");
            System.out.print(l2.indexOf(i+10));
            System.out.print("\n");
        }
        System.out.println("------------------------------------------");
        for (int i = 0; i < l2.size(); i++) {
            System.out.print(i + " -> ");
            System.out.print(l2.lastIndexOf(i+10));
            System.out.print("\n");
        }

    }
}
