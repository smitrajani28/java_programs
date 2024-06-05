import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class Practical_10 {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107011");
        System.out.println("---------------------------------------------");

        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter the 10 Integer..............");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        for (int i=0;i<(a.length)-1;i++){
            for (int j=0;j<(a.length)-i-1;j++){
                int temp;
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        System.out.println("Reversing number................");
        for (int i=0;i<(a.length);++i){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
