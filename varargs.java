public class varargs{
    static int sum(int ...a){
        int result=0;
        for (int i : a) {
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,8,9));
    }
}