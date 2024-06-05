public class method_calling {
    static int sum(int a,int b){
        int sum;
        sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        int c = sum(2,3);
        System.out.println(c);
    }
}
