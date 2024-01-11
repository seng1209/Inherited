public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }
}
