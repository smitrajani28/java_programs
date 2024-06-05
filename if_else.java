import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        System.out.println("Enter marks of Maths :");
        Scanner a = new Scanner(System.in);
        byte Maths = a.nextByte();
        System.out.println("Enter marks of Science :");
        Scanner b = new Scanner(System.in);
        byte Science = b.nextByte();
        System.out.println("Enter marks of English :");
        Scanner c = new Scanner(System.in);
        byte English = c.nextByte();
        float avg = (Maths + Science + English)/3f;
        if(avg>=40 && Maths>=33 && Science>=33 && English>=33)
        {
            System.out.println("you are passed...!");
        }
        else 
        {
            System.out.println("Sorry, you are failed....");
        }
    }
}
