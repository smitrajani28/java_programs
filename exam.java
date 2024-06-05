import java.util.Scanner;
class stack{
    int i=-1;
    int n=4;
       void push(int []arr, int a){
        if(i==n){
            System.out.println("stack overflow");
        }
        else{
            i++;
            arr[i]=a;
        }
    }
    void pop(int []arr){
         if(i==-1){
            System.out.println("stack underflow");
        }
        else{
            arr[i]=0;
            i--;
        }
    }
    void display(int []arr){
        int j=0;
        if(i==-1){
            System.out.println("empty");
        }
        else{
        while(j<=i){
            System.out.println(" " + arr[j] + " ");
            j++;
        }
    }
    }
}

public class exam {
    public static void main(String[] args) {
        stack stack1 = new stack();
        System.out.println("welcome to stack");
        int arr[] = new int[4];
        while (true) {
            System.out.println("choose one option");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. display");
            System.out.println("4. exit");
            Scanner a1 = new Scanner(System.in);
            int choice = a1.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter digit to enter:");
                    int push1= a1.nextInt();
                    stack1.push(arr,push1);
                    break;
            
                case 2:
                    stack1.pop(arr);
                    break;
            
                case 3:
                    stack1.display(arr);
                    break;

                case 4:
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}
