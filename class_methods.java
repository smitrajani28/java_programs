import java.util.Scanner;
import java.util.Set;

class employee{
    String name;
    int salary;

    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setdetail(String n, int x){
        name = n;
        salary = x;
    }
}
public class class_methods {
    public static void main(String[] args) {
        employee p1 = new employee();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name :");
        String name1 = scan.next();
        System.out.println("Enter Salary");
        int salary1 = scan.nextInt();
        p1.setdetail(name1, salary1);
        System.out.println("Employee name is :" + p1.getname() + " and his salary is :" + p1.getsalary());
    }
}
