public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 6);
        System.out.println("Area " + rectangle.getArea());
        System.out.println("Perimeter "+rectangle.getPerimeter());
        Square square = new Square(3);
        System.out.println("Square "+ square.getArea());
    }
}