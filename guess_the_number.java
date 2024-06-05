import java.util.Random;
import java.util.Scanner;

class random_number {
    int myrandom;
    
    public random_number() {
        Random rand = new Random();
        myrandom = rand.nextInt(100);
    }
}

public class guess_the_number {
    public static void main(String[] args) {
        int count = 0;
        random_number rand1 = new random_number();
        System.out.println(rand1.myrandom);
        Scanner guess = new Scanner(System.in);
        while (true) {
            System.out.println("Guess the number(Between 0-100) :");
            int g1= guess.nextInt();
            if (g1==rand1.myrandom) {
                System.out.println("you are right");
                count++;
                break;
            }
            else if (g1>rand1.myrandom) {
                System.out.println("lower number plz");
                count++;
            }
            else if (g1<rand1.myrandom) {
                System.out.println("higher number plz");
                count++;
            }
        }
        System.out.println("you gueesed in " + count + " tries");
    }
}
