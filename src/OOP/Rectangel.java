package OOP;

public class Rectangel {
    private double width;
    private double height;

    public Rectangel(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Metod för att beräkna arean
    public double calculateArea() {
        return width * height;
    }

    // Metod för att beräkna omkretsen
    public double calculatePerimeter() {
        return 2 * (width + height);
    }


}
