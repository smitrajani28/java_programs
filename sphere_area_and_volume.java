import java.util.Scanner;

class sphere{
    int radius;
    double area;
    double volume;

    // public int getHeight() {as
    //     return height;
    // }

    // public void setHeight(int height) {
    //     this.height = height;
    // }

    // public int getRadius() {
    //     return radius;
    // }

    // public void setRadius(int radius) {
    //     this.radius = radius;
    // }
    public sphere(int radius){
        this.radius = radius;
        area =(float)(4*Math.PI*radius*radius);
        volume =(float)(4*Math.PI*radius*radius*radius/3);
    }
    // float area(){
    //     area =(float)((2*Math.PI*radius*height)+(2*Math.PI*radius*radius));
    //     return area;
    // }
    // float volume(){
    //     volume =(float)(Math.PI*radius*radius*height);
    //     return volume;
    // }
}
public class sphere_area_and_volume {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int r = scan.nextInt();
        sphere s1 = new sphere(r);
        // s1.radius = r;
        // System.out.println("Area : " + s1.area());
        // System.out.println("Volume : " + s1.volume());
        System.out.println("Area : " + s1.area);
        System.out.println("Volume : " + s1.volume);
    }
}
