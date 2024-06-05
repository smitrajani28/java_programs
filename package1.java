

class ractangle {
    float length;
    float width;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    double area;
    void surface_area(){
        this.area = length*width;
    }
}

class sqaure extends ractangle {
    float length = width;
}

class circle {
    float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    double area;
    void surface_area(){
        this.area = Math.PI*radius*radius;
    }
}

class cylinder extends circle {
    double volume;
    float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    void shape_volume(){
        this.volume = area*height;
    }
}

class sphere extends circle {
    double volume;
    void shape_volume(){
        this.volume = 4*area*radius/3;
    }
}

public class package1 {
    
}