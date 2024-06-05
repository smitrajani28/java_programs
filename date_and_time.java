import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar;
public class date_and_time {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println("---------------------------------------------------------");
        Calendar c = Calendar.getInstance();
        // System.out.println(c);
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println("---------------------------------------------------------");
        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        // System.out.println(c);
        System.out.println(c2.getCalendarType());
        System.out.println(c2.getTimeZone().getID());
        System.out.println("---------------------------------------------------------");
    }
}
