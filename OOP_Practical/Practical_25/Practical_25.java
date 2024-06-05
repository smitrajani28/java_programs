import java.io.*;
import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;

public class Practical_25 {
    public static void main(String[] args) throws FileNotFoundException  {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107011");
        System.out.println("---------------------------------------------");

        if (args.length != 1)
            throw new InvalidParameterException("Usage: fullFilePathName");

        File file = new File(args[0]);
        if (!file.isFile())
            throw new FileNotFoundException(file + " is not a file.");
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)), 10000)) {

            String inputS;
            StringBuilder sb = new StringBuilder(10000);
            while ((inputS = in.readLine()) != null)
                sb.append(inputS);

            String[] words = sb.toString().split("\\s+");
            // non duplicate words
            TreeSet<String> ndWords = new TreeSet<>(Arrays.asList(words));

            for (String s : ndWords)
                System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
