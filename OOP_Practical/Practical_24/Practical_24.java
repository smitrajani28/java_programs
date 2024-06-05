import java.time.LocalDate;
import java.time.LocalTime;
import java.util.PriorityQueue;
public class Practical_24 {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107011");
        System.out.println("---------------------------------------------");

        MyPriorityQueue<String> queue = new MyPriorityQueue<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");

        MyPriorityQueue<String> queue1 = null;
        try
        {
            queue1 = (MyPriorityQueue<String>)(queue.clone());
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        System.out.print(queue1);
    }

    static class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable
    {
        @Override
        public Object clone() throws CloneNotSupportedException
        {
            MyPriorityQueue<E> clone = new MyPriorityQueue<>();
            this.forEach(clone::offer);
            return clone;
        }

    }
}
