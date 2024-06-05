import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime D1 = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("DD-MM-YYYY");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String mydate = D1.format(df);
        String mydate2 = D1.format(df2);
        System.out.println(mydate);
        System.out.println(mydate2);
    }
}
