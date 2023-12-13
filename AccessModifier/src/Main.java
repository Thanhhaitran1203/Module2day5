
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle ();
        Circle d = new Circle (2);
        System.out.println (c.getRadius ());
        System.out.println (c.getArea ());
        System.out.println (d.getRadius ());
        System.out.println (d.getArea ());
    }
}