import java.util.Scanner;
public class marks_average {
    public static void main(String[] args) {
    Scanner num1= new Scanner(System.in);
    System.out.print("enter marks of Maths:");
    int a = num1.nextInt(); 
    System.out.println(num1.hasNext());
    System.out.print("enter marks of Chemistry:");
    int b = num1.nextInt(); 
    System.out.print("enter marks of Physics:");
    int c = num1.nextInt(); 
    System.out.print("enter marks of English:");
    int d = num1.nextInt(); 
    System.out.print("enter marks of Computer:");
    int e = num1.nextInt(); 
    int sum = (a + b + c + d + e)/5;
    System.out.print("percentage :");
    System.out.print(sum);
    System.out.print(" %");
    }
}
