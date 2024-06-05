import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;


public class Practical_06 {


    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107011");
        System.out.println("---------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0);


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        }
         else {
            System.out.println("Consonent");
        }
    }
}
