import java.util.Scanner;

public class library_books {
    static int addBook(int add, int total) {
        total += add;
        return total;
    }

    static int issueBook(int issue, int total) {
        total -= issue;
        return total;
    }

    static int returnBook(int returned, int total) {
        total += returned;
        return total;
    }

    static void showAvailableBook(int total) {
        System.out.println("Availabe Books : " + total);
    }

    public static void main(String[] args) {
        int total = 1000;
        while (true) {
            Scanner book = new Scanner(System.in);
            System.out.println("\t\tINDIAN LIBRARY\t\t");
            System.out.println("What you want to do ..?");
            System.out.println("1. Add Books");
            System.out.println("2. Issue Books");
            System.out.println("3. Return Books");
            System.out.println("4. Show available Books");
            byte choose = book.nextByte();
            switch (choose) {
                case 1: {
                    System.out.println("Enetr Quantity :");
                    int Quantity1 = book.nextInt();
                    total = addBook(Quantity1, total);
                    break;
                }
                case 2: {
                    System.out.println("Enetr Quantity :");
                    int Quantity1 = book.nextInt();
                    total = issueBook(Quantity1, total);
                    break;
                }
                case 3: {
                    System.out.println("Enetr Quantity :");
                    int Quantity1 = book.nextInt();
                    total = returnBook(Quantity1, total);
                    break;
                }
                case 4: {
                    showAvailableBook(total);
                    break;
                }
                default: {
                    System.out.println("invalid entry");
                    break;
                }
            }
        }
    }
}
