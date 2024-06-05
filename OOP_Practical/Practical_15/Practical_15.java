import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Practical_15 {
    public static int bin2Dec(String binaryString) throws NumberFormatException
    {
        int decimal = 0;
        int strLength=binaryString.length();
        for (int i = 0; i < strLength; i++)
        {
            if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
            {
                throw new NumberFormatException("The Input String is not Binary");
            }

            decimal += (binaryString.charAt(i)-'0') * Math.pow(2, strLength-1-i);
        }
        return decimal;
    }
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107011");
        System.out.println("---------------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Binary Value : ");
        String str = input.nextLine();
        try
        {
            System.out.println("Value = " + bin2Dec(str));
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
