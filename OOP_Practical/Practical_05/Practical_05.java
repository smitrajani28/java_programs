import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Practical_05 {


 Scanner sc=new Scanner(System.in);
    void Bubblesort() {
        int arr[];
        arr =new int[3];
//        int n=arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value of " +i + " integer");
          arr[i]=sc.nextInt();
        }

        for(int i=0;i<(arr.length)-1;i++){
            for(int j=0;j<(arr.length)-i-1;j++){
                if (arr[j]< arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Answer.............");
        for (int i=0;i<arr.length;++i){
            System.out.print(arr[i]);
            System.out.print("  ");
        }

    }



        public static void main (String[]args){
            LocalDate myObj = LocalDate.now();
            LocalTime myObj1 = LocalTime.now();
            System.out.println("DATE: "+myObj);
            System.out.println("TIME: "+myObj1);
            System.out.println("ENROLL NO: 210130107011");
            System.out.println("---------------------------------------------");

          Practical_05 obj=new Practical_05();
          obj.Bubblesort();
//         obj.Sorted_arry();


        }
    }
