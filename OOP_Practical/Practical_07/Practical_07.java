import java.time.LocalDate;
import java.time.LocalTime;

public class Practical_07 {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107011");
        System.out.println("---------------------------------------------");

        int alpha1 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int alpha2 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int alpha3 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int digit1 = (int)(Math.random() * 10);
        int digit2 = (int)(Math.random() * 10);
        int digit3 = (int)(Math.random() * 10);
        int digit4 = (int)(Math.random() * 10);
        System.out.println("Plate number is:" + (char)(alpha1) + ((char)(alpha2)) +
                ((char)(alpha3)) + digit1 + digit2 + digit3 + digit4);
    }
}
