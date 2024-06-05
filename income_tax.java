import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        float tax=0;
        System.out.println("Enter your income :");
        Scanner p = new Scanner(System.in);
        int amount = p.nextInt();
        if (amount >= 250000 && amount <= 500000) {
            tax = (amount - 250000) * 0.05f;
        }
        if (amount >= 500000 && amount <= 1000000) {
            tax = (amount - 500000) * 0.2f + 12500;
        }
        if (amount >= 1000000) {
            tax = (amount - 1000000) * 0.3f + 100000 + 12500;
        }
        System.out.println("tax on "+amount+" is "+ tax);
    }
}
