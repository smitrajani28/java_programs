import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) {
        File file1 = new File("Smit_Rajani.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }



        try {
            FileWriter fileWriter1 = new FileWriter("Smit_Rajani.txt");
            fileWriter1.write("Hello my name is Smit Rajani");
            fileWriter1.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
        
        Scanner sc;
        try {
            sc = new Scanner(file1);;
            while (sc.hasNextLine()) {
                String string = sc.nextLine();
                System.out.println(string);
                
            }
            sc.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
    }
}
