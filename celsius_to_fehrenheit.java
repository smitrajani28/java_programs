public class celsius_to_fehrenheit {
    static float temperature(float a){
        float result = (9*a/5) + 32;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(temperature(33));
    }
}
