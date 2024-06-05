import java.time.LocalDate;
import java.time.LocalTime;

public class Practical_23 {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107011");
        System.out.println("---------------------------------------------");

        Integer[][] list = new Integer[10][10];
        int value = 0;
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < list[i].length; j++)
            {
                list[i][j] = value++;
            }
        }
        System.out.println("Max = " + max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list)
    {
        E max = list[0][0];
        for (E[] elements : list)
        {
            for (E element : elements)
            {
                if (element.compareTo(max) > 0)
                {
                    max = element;
                }
            }
        }
        return max;
    }
}
