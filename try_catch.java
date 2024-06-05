import java.io.IOException;
import java.util.Scanner;
public class try_catch {
    public static void main(String[] args) throws IOException {
        Scanner a = new Scanner(System.in);
        System.out.println(("Enter a number:"));
        float n = a.nextInt();
        for (int i = 0; i <= n; i++) {
            try{
                System.out.println(n/i);
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            catch(Exception e){
                System.out.println("another error:" + e);
            }
            
        }

    }
}
