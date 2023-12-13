public class Circle {
    private double radius;
    private String color;
    final double pi = 3.14;
    Circle(){
        radius = 1.0;
        color = "red";
    }
    Circle(double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }
    protected double getArea(){
        return radius * radius * pi;
    }
}
