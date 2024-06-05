
class circle {
    int radius;

    public double area(int radius) {
        return (float) (Math.PI * radius * radius);
    }
}

class cylinder extends circle {
    public double volume(int radius, int height) {
        return area(radius) * height;
    }
}

public class circle_to_cylinder_inheritance {
    public static void main(String[] args) {
        int radius = 5;
        int height = 10;
        cylinder c1 = new cylinder();
        System.out.println("area of cylinder's circle :" + c1.area(radius));
        System.out.println("volume of cylinder :" + c1.volume(radius, height));
    }
}
