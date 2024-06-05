import java.util.Scanner;

public class greater_or_not {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        try (Scanner num = new Scanner(System.in)) {
            int a = num.nextInt();
            System.out.println(a>10);
        }
    }
}
