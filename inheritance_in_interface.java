interface parent1 {
    int sum(int a, int b);

    int sub(int a, int b);
}

interface child1 extends parent1 {
    int mul(int a, int b);

    int div(int a, int b);
}

class parent2 implements parent1 {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class child2 extends parent2 implements child1{
    public int mul(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        return a/b;
    }
}

public class inheritance_in_interface {
    public static void main(String[] args) {
        child2 a = new child2();
        System.out.println(a.sum(20, 10));
        System.out.println(a.sub(20, 10));
        System.out.println(a.mul(20, 10));
        System.out.println(a.div(20, 10));
    }
}
