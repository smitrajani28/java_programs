import java.util.Scanner;

class cylinder{
    int height;
    int radius;
    float area;
    float volume;

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
    public cylinder(int radius, int height){
        this.height= height;
        this.radius = radius;
        area =(float)((2*Math.PI*radius*height)+(2*Math.PI*radius*radius));
        volume =(float)(Math.PI*radius*radius*height);
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
public class cylinder_area_and_volume {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int r = scan.nextInt();
        System.out.print("Enter Height : ");
        int h = scan.nextInt();
        cylinder c1 = new cylinder(h,r);
        // c1.height = h;
        // c1.radius = r;
        // System.out.println("Area : " + c1.area());
        // System.out.println("Volume : " + c1.volume());
        System.out.println("Area : " + c1.area);
        System.out.println("Volume : " + c1.volume);
    }
}
