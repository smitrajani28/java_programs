import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Practical_22 {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107011");
        System.out.println("---------------------------------------------");

        Scanner input = new Scanner(System.in);
        int product=1;
        System.out.print("Enter five integers: ");
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
            product *= list[i];
        }
        System.out.println("The Product of elements is " + product);
    }
}

