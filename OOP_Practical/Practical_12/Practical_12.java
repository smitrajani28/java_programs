import java.time.LocalDate;
import java.time.LocalTime;

public class Practical_12 {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107011");
        System.out.println("---------------------------------------------");

            java.util.Random randomNo = new java.util.Random(1000);

            // displays first 100 random integers between 0 to 49
            System.out.println(" 100 Random numbers are : ");
            for (int i = 0; i < 100; i++) {
                System.out.print(randomNo.nextInt(49) + " ");

            }

        }
    }
