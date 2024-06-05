import java.io.IOException;
import java.util.Scanner;

public class calculator_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation do you perform");
        System.out.println("1.Additiom \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        int choice = sc.nextInt();
        System.out.println("Enter values");
        int a = sc.nextInt();
        int b = sc.nextInt();
            int result;
            switch (choice) {
                case 1:
                try {
                    if (a > 100000 || b > 100000) {
                        throw new Exception();
                    }
                    result = a + b;
                } catch (ArithmeticException e) {
                    System.out.println(e);
                } catch(Exception e){
                    System.out.println(e);
                }
                break;
                case 2:
                try {
                    if (a > 100000 || b > 100000) {
                        throw new Exception();
                    }
                    result = a - b;
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
                case 3:
                try {
                    if (a > 7000 || b > 7000) {
                        throw new Exception();
                    }
                    result = a * b;
                } catch (ArithmeticException e) {
                    System.out.println(e);
                } catch(Exception e){
                    System.out.println(e);
                }
                
                break;
                case 4:
                try {
                    if (a > 100000 || b > 100000) {
                        throw new Exception();
                    }
                    result = a / b;
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }catch(Exception e){
                    System.out.println(e);
                }
                    break;

                default:
                    System.out.println("invalid choice");
                    break;
                }
    }
}
