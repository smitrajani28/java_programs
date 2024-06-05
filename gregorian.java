import java.util.Calendar;
import java.util.GregorianCalendar;

public class gregorian {
    public static void main(String[] args) {
        GregorianCalendar cal1 = new GregorianCalendar();
        System.out.println(cal1.get(Calendar.HOUR_OF_DAY) + ":" + cal1.get(Calendar.MINUTE) + ":" + cal1.get(Calendar.SECOND));
        for (int i = 2000; i < 3000; i++) {
            if (cal1.isLeapYear(i)) {
                System.out.print(i + "          ");
            }
        }
    }
}
