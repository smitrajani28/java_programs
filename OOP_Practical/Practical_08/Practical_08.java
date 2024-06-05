import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Practical_08 {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107011");
        System.out.println("---------------------------------------------");

        int div=2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer Value : ");
        int number = input.nextInt();
        while(number > 1)
        {
            if(number%div==0)
            {
                System.out.print(div+",");
                number=number/div;
            }
            else
            {
                div++;
            }
        }
    }
}
