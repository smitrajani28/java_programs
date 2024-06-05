class animal{
    String type = "domestic";
    String food = "mix";
}
class dog extends animal{
    String sound = "bark";
}
public class inheritance {
    public static void main(String[] args) {
        dog d1 = new dog();
        System.out.println(d1.sound);
        System.out.println(d1.food);
        System.out.println(d1.type);
    }
}
